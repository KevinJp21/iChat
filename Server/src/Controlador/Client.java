package function;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.ImageIcon;
import message.Message;

public class Client extends Thread {

    private Socket socket;
    private String userName;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    private ImageIcon profile;
    private int ID;
    private String time;

    public Client(Socket socket) {//constructor de la clase Client, que recibe un objeto Socket como argumento. 
        this.socket = socket;
        execute();
    }

    private void execute() {//inicia el hilo de ejecución del cliente utilizando this.start(). Esto significa que el cliente se ejecutará en paralelo con otros clientes y el servidor.
        this.start();
    }

    @Override
    public void run() {
        try {
            /* se inicializan los flujos de entrada (in) y salida (out) de objetos a través del socket para comunicarse con el cliente. Además, se obtiene un ID único para el cliente llamando al método addClient(this) de la clase Method y se almacena en la variable ID.*/
            in = new ObjectInputStream(socket.getInputStream());
            out = new ObjectOutputStream(socket.getOutputStream());
            ID = Method.addClient(this);
            /*Se inicia un bucle infinito que permite al cliente escuchar continuamente mensajes entrantes del servidor y otros clientes. Dentro del bucle, se lee un objeto Message del flujo de entrada (in) y se almacena en la variable ms. Luego, se obtiene el estado del mensaje (status) utilizando getStatus()*/
            while (true) {
                Message ms = (Message) in.readObject();
                String status = ms.getStatus();
                if (status.equals("New")) {
                    /*Se extrae el nombre de usuario y la hora de conexión del mensaje y se almacenan en las variables userName y time.*/
                    userName = ms.getName().split("!")[0];
                    time = ms.getName().split("!")[1];
                    profile = ms.getImage();
                    Method.getTxt().append("Nuevo Cliente: " + userName + " Se ha conectado\n");
                     // Listar a todos los amigos y enviarlos al nuevo cliente
                    for (Client client : Method.getClients()) {
                        ms = new Message();
                        ms.setStatus("New");
                        ms.setID(client.getID());
                        ms.setName(client.getUserName() + "!" + client.getTime());
                        ms.setImage(client.getProfile());
                        out.writeObject(ms);
                        out.flush();
                    }
                    // Enviar al nuevo cliente a los clientes existentes
                    for (Client client : Method.getClients()) {
                        if (client != this) {
                            ms = new Message();
                            ms.setStatus("New");
                            ms.setName(userName + "!" + time);
                            ms.setID(ID);
                            ms.setImage(profile);
                            client.getOut().writeObject(ms);
                            client.getOut().flush();
                        }
                    }
                } else {
                    /*se reenvía el mensaje a todos los clientes conectados, incluido el propio cliente que lo envió.*/
                    for (Client client : Method.getClients()) {
                        client.getOut().writeObject(ms);
                        client.getOut().flush();
                    }
                }
            }

        } catch (Exception e) {
            try {
                //Eliminar cliente del servidor
                Method.getClients().remove(this);
                Method.getTxt().append("Cliente : " + userName + " Se ha salido del servidor ...\n");
                for (Client s : Method.getClients()) {
                    Message ms = new Message();
                    ms.setStatus("Error");
                    ms.setID(ID);
                    ms.setName(userName);
                    s.getOut().writeObject(ms);
                    s.getOut().flush();
                }
            } catch (Exception e1) {
                Method.getTxt().append("Error : " + e1);
            }
        }
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ObjectInputStream getIn() {
        return in;
    }

    public void setIn(ObjectInputStream in) {
        this.in = in;
    }

    public ObjectOutputStream getOut() {
        return out;
    }

    public void setOut(ObjectOutputStream out) {
        this.out = out;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ImageIcon getProfile() {
        return profile;
    }

    public void setProfile(ImageIcon profile) {
        this.profile = profile;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}

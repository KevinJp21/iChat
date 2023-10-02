package function;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import message.Message;
import model.Friend;

public class Method {
 

    private static HashMap<Integer, Friend> friends = new HashMap<>();
    private static Socket client;
    private static ObjectOutputStream out;
    private static ObjectInputStream in;
    private static int myID;
    private static String myName;
    private static String time;
    private static JFrame fram;

    public static void setTextFieldSyle(JTextField txt, String style) {//Propiedad inicial del jtextField area del login
        txt.setName("");
        txt.setForeground(new Color(186, 186, 186));
        txt.setText(style);
        txt.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent fe) {//Este metodo hace que cuando se haga click en el jtextField del login, el color de la fuente sea gris
                if (txt.getName().equals("")) {
                    txt.setForeground(new Color(186, 186, 186));
                    txt.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {//Este metodo hace que cuando se pierda el enfoque del jtextField del login, el color del holder sea gris
                if (txt.getText().trim().equals("")) {
                    txt.setForeground(new Color(186, 186, 186));
                    txt.setText(style);
                    txt.setName("");
                } else {
                    txt.setName("have");
                }
            }
        });
        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                if (txt.getText().trim().equals("")) {
                    txt.setName("");
                } else {
                    txt.setName("have");
                }
            }
        });
    }

    public static void connect(ImageIcon icon, String userName, String IP) throws Exception {/*Este método establece una conexión del cliente con el servidor utilizando un socket. Envía un mensaje al servidor con el nombre de usuario y la hora de conexión.*/
        client = new Socket(IP, 5000);
        out = new ObjectOutputStream(client.getOutputStream());
        in = new ObjectInputStream(client.getInputStream());
        SimpleDateFormat df = new SimpleDateFormat("hh:mm aa");
        String t = df.format(new Date());
        Message ms = new Message();
        ms.setStatus("New");
        ms.setImage(icon);
        ms.setName(userName + "!" + t);
        out.writeObject(ms);
        out.flush();
        myName = userName;
        time = t;
    }

    public static void sendMessage(String text) throws Exception {//Este método envía un mensaje de texto al servidor.
        Message ms = new Message();
        ms.setStatus("Message");
        ms.setID(Method.getMyID());
        ms.setMessage(text);
        out.writeObject(ms);
        out.flush();
    }
    
    //El metodo getFount y getFountBold devuelven las fuentes que se está usando para este programa
    public static Font getFount() {
        return new java.awt.Font("Khmer SBBIC Serif", 0, 12);
    }

    public static Font getFountBold() {
        return new java.awt.Font("Khmer SBBIC Serif", 1, 12);
    }
    

    public static HashMap<Integer, Friend> getFriends() {
        return friends;
    }

    public static void setFriends(HashMap<Integer, Friend> aFriends) {
        friends = aFriends;
    }

    public static ObjectOutputStream getOut() {
        return out;
    }

    public static void setOut(ObjectOutputStream aOut) {
        out = aOut;
    }

    public static ObjectInputStream getIn() {
        return in;
    }

    public static void setIn(ObjectInputStream aIn) {
        in = aIn;
    }

    public static int getMyID() {
        return myID;
    }

    public static void setMyID(int aMyID) {
        myID = aMyID;
    }

    public static String getMyName() {
        return myName;
    }

    public static void setMyName(String aMyName) {
        myName = aMyName;
    }

    public static Socket getClient() {
        return client;
    }

    public static void setClient(Socket aClient) {
        client = aClient;
    }

    public static String getTime() {
        return time;
    }

    public static void setTime(String aTime) {
        time = aTime;
    }

    public static JFrame getFram() {
        return fram;
    }

    public static void setFram(JFrame aFram) {
        fram = aFram;
    }
}

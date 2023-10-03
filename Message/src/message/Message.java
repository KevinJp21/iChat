package message;

import java.io.Serializable;

public class Message implements Serializable {//Se utiliza la interfaz serializable para convertir el objeto Mensaje en bytes y poder transmitirlo a otros dispositivos de la red

    private static final long serialVersionUID = 123L;//Como mensaje esta importado en server y client, ambos tienen el mismo serial UID por lo que la interfaz serialize puede deserializar el objeto recibido
    private String status;
    private int ID;
    private String name;
    private String message;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

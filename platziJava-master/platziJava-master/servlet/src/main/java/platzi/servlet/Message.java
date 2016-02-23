package platzi.servlet;

public class Message {

    private long size;
    private String message;
    private Integer numero;

    public Message() {
    }

    
    public Message(String message) {
        this.message = message;

    }

    public long getSize() {
        return message.length();
    }

    public String getMessage() {
        return message;
    }

    public Integer getNumero() {
        return numero;
    }
    
    public void setSize(long size) {
        this.size = size;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
}

package messagep;

public class Message {
    String mes;

    Message(String s){
        mes = s;
    }

    public String getMessage(){
        return mes;
    }

    public String getPrefixedMessage(){
        return "hi "+mes;
    }
}
package sandbox;

public class teste {

    public static void main(String[] args) {
        sendmessage("test", 5);
        sendmessage("fromage", 17);
    }

    public static void sendmessage(String message, int number) {
        System.out.println("Hello " + number + "World!" + message);
    }


}   

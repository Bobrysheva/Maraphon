package day13;


import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    public static List<Message> Messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text){
        Messages.add(new Message(u1, u2, text));

    }
    public static void showDialog(User u1, User u2) {
        for (Message theseMessage : Messages) {
            if ((theseMessage.getSender() == u1 && theseMessage.getReceiver() == u2) ||
                    (theseMessage.getSender() == u2 && theseMessage.getReceiver() == u1)) {
                System.out.println(theseMessage.getSender() + ": " + theseMessage.getText());
            }
        }
    }
}

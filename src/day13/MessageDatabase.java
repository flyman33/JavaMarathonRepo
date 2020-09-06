package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    public static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static void showDialog(User u1, User u2) {
        for(Message s : messages) {
            if((s.getSender().equals(u1) && s.getReceiver().equals(u2)) || (s.getSender().equals(u2) &&
                    s.getReceiver().equals(u1))) {
                System.out.println(s.getSender() + ": " + s.getText());
            }
        }
    }
}

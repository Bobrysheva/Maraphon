package day13;

public class Task1 {
    public static void main(String[] args) {

        User Mike = new User("Mike");
        User Bella = new User("Bella");
        User Ron = new User("Ronny");

        Mike.sendMessage(Bella, "Hello!");
        Bella.sendMessage(Mike, "How are you?");
        Mike.sendMessage(Ron, "How was your day?");
        Mike.sendMessage(Bella, "ok, you?");

        MessageDatabase.showDialog(Mike, Bella);
    }
}

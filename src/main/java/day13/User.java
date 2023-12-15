package day13;

//public void sendMessage(User user, String text) - отправляет сообщение с текстом text пользователю user. Здесь должен
// использоваться статический метод из MessageDatabase.

import java.util.ArrayList;
import java.util.List;

public class User {
    String username;
    List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return getUsername(); //ВОЗМОЖНО: username
    }

    public String getSubscriptions(User user) {
        return subscriptions.toString();
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User a : subscriptions) {
            if (a.subscriptions.contains(user))
                return true;
        }
        return false;
    }

    public boolean isFriend (User user) {
        if (this.subscriptions.contains(user) && user.subscriptions.contains(this))
            return true;
        else return false;
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this, user, text);
        }
}

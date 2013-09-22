package lesson_8.chat_practice;


import java.io.Serializable;

public class User implements Serializable {
    String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return login;
    }
}

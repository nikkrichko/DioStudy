package lesson_8.chat_practice;


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Massage implements Serializable {
    User user = new User();
    Date date = new Date();
    String text;

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return  date + " : " + user +
                " : " + text + '\'';
    }
}

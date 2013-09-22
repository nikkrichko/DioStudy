package lesson_8.chat_practice;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.*;


public class Serrializator {
    public static void main(String[] args) {


    Massage someMassage = new Massage();
    someMassage.setText("I'm go to Ireland.... yahoooooo!!!!!");
    someMassage.user.setLogin("Kovalevskiy");

        try {
    OutputStream outputStream = new FileOutputStream(someMassage.date.getTime()+".file");
    ObjectOutputStream oos = new ObjectOutputStream(outputStream);
    oos.writeObject(someMassage);
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
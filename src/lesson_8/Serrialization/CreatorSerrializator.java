package lesson_8.Serrialization;


import java.io.*;

public class CreatorSerrializator {
    protected static int maxValue = 15;
    public static int generateRandomInt(int maxValue) {
        return (int)((Math.random()*(maxValue-1))+1);
    }

    public static void main(String[] args) {
        Massage someMassage = new Massage();
        for (int i = 0; i < someMassage.getMaxSize(); i++){
            someMassage.setPosition(i, generateRandomInt(maxValue));

        }
        System.out.println(someMassage.toString());

        try {
            OutputStream outputStream = new FileOutputStream("output.file");
            ObjectOutputStream oos = new ObjectOutputStream(outputStream);
            oos.writeObject(someMassage);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

package lesson_8.Serrialization;


import java.io.*;

public class ReaderDeserrialisator {


    public static void main(String[] args) {
    Massage someMassage;

    try{
    InputStream inputStreamReader = new FileInputStream("output.file");
    ObjectInputStream oir = new ObjectInputStream(inputStreamReader);
          someMassage = (Massage) oir.readObject();
        System.out.println(someMassage.toString());

    }
    catch (IOException e){
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    }
}

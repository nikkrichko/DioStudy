package lesson_8.Watcher;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WatcherLogger {

    Date dNow = new Date( );
    SimpleDateFormat ft =
            new SimpleDateFormat ("yyyy.MM.dd hh:mm:ss");


    public void log(String log, String fileName){
        try{
            Writer logger = new FileWriter(new File(fileName + ".txt"), true);
            logger.write(ft.format(dNow) + log + "\n");
            logger.close();
        }  catch (IOException exeption) {
            exeption.printStackTrace();
        }
    }
}

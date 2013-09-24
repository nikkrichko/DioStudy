package lesson_8.Watcher;


import java.io.*;

public class WatcherLogger {

    public void log(String log, String fileName){
        try{
            Writer logger = new FileWriter(new File(fileName + ".txt"), true);
            logger.write(log + "\n");
            logger.close();
        }  catch (IOException exeption) {
            exeption.printStackTrace();
        }
    }
}

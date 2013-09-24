package lesson_8.Watcher;


import java.io.*;

public class WatcherLogger {

    public void log(String log){
        try{
            Writer logger = new FileWriter(new File("LogForWatcher.txt"), true);
            logger.write(log + "\n");
            logger.close();
        }  catch (IOException exeption) {
            exeption.printStackTrace();
        }
    }
}

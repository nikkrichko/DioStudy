package lesson_8.Watcher;

import lesson_8.chat_practice.Massage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.file.*;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;


public class Wathcer {
    WatcherLogger logger = new WatcherLogger();
    WatchService watcher;




    public Wathcer() {
        try {
            watcher = FileSystems.getDefault().newWatchService();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void dessialisatorHelper() throws IOException {


        Path dir = Paths.get("");
        System.out.println("deserrialisatorHelper STARTED:");
        System.out.println(dir.toAbsolutePath());
        try {
            dir.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);

        } catch (IOException x) {
            System.err.println(x);
        }
    }

    public void listenDir(){

        for(;;){

            WatchKey key = null;
            try {
                key = watcher.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (key != null) {
                for (WatchEvent<?> event : key.pollEvents()){
                    WatchEvent<Path> ev = (WatchEvent<Path>)event;
                    Path filename = ev.context();


                    logger.log(event.kind().name() + " " + filename, "LogForWatcher");
                }
                key.reset();
            }

        }
    }


}

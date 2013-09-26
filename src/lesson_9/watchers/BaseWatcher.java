package lesson_9.watchers;


import lesson_8.Watcher.WatcherLogger;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

public class BaseWatcher implements Callable<List<Path>> {
    WatcherLogger logger = new WatcherLogger();
    WatchService watcher;
    WatchEvent.Kind<Path> type;
    List<Path> files = new ArrayList<>();

    public BaseWatcher(WatchEvent.Kind<Path> type) {

        try {
            watcher = FileSystems.getDefault().newWatchService();
            this.type = type;
            initWatcher();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void initWatcher() throws IOException {


        Path dir = Paths.get("");
        System.out.println("deserrialisatorHelper STARTED:");
        System.out.println(dir.toAbsolutePath());
        try {
            dir.register(watcher, type);

        } catch (IOException x) {
            System.err.println(x);
        }
    }

    public void listenDir(){

        {

            WatchKey key = null;
            try {
                key = watcher.poll(1000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (key != null) {
                for (WatchEvent<?> event : key.pollEvents()){
                    WatchEvent<Path> ev = (WatchEvent<Path>)event;
                    Path filename = ev.context();


                    logger.log(event.kind().name() + " " + filename, "LogFor" + type);
                    files.add(filename);
                }
                key.reset();
            }

        }
    }

    @Override
    public List<Path> call() throws Exception {
        files = new ArrayList<Path>();
        listenDir();
        return files;
    }
}

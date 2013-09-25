package lesson_9;

import lesson_9.watchers.BaseWatcher;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static java.nio.file.StandardWatchEventKinds.*;
public class Watcher {

    private ExecutorService pool = Executors.newFixedThreadPool(2);
    List<BaseWatcher> watchers = new ArrayList<>();
    List<Future<List<Path>>> futures = new ArrayList<>();

    private void watchers(){
        watchers.add(new BaseWatcher(ENTRY_CREATE));
        watchers.add(new BaseWatcher(ENTRY_DELETE));
        watchers.add(new BaseWatcher(ENTRY_MODIFY));

        for (;;) {
            for (BaseWatcher baseWatcher : watchers) {
                futures.add(pool.submit(baseWatcher));
            }
            for (Future<List<Path>> future : futures) {
                try {
                    future.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Watcher().watchers();
    }



}

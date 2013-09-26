package lesson_9.watchers;

import lesson_8.Watcher.FileAttribute;
import lesson_8.Watcher.WatcherLogger;

import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import static java.nio.file.FileVisitResult.CONTINUE;


public class Visitor extends SimpleFileVisitor<Path> implements Callable<List<Path>> {
    private WatcherLogger logger = new WatcherLogger();
    private String attributes;
    private Map<Path, FileAttribute> mapOfFiles = new HashMap<>();
    private List<Path> resultList = new ArrayList<>();

    public void fileAttr(Path file){
    FileAttribute fileAttr = new FileAttribute(file.toFile().canExecute(), file.toFile().canWrite(), file.toFile().canRead());
        if (mapOfFiles.get(file) != null && !mapOfFiles.get(file).equals(fileAttr)) {
            FileAttribute oldAttr = mapOfFiles.get(file);
            String logTxt = "change some atrributes";
            if (oldAttr.isExecuted() != fileAttr.isExecuted()) {
                logTxt += " Execute attr changed ";
            }
            if (oldAttr.isRead() != fileAttr.isRead()) {
                logTxt += " Read attr changed ";
            }
            if (oldAttr.isWrite() != fileAttr.isWrite()) {
                logTxt += " Write attr changed ";
            }
            logger.log(file + logTxt, "ChAtrrLogger");
            resultList.add(file);

        }
        mapOfFiles.put(file, fileAttr);


}


    @Override
    public FileVisitResult visitFile(Path file,
                                     BasicFileAttributes attr) {
        if (file.toString().endsWith(".file")){
            fileAttr(file);
        }
        return CONTINUE;
    }


    @Override
    public List<Path> call() throws Exception {
        resultList = new ArrayList<Path>();
        Path startingDir = Paths.get("");
        Files.walkFileTree(startingDir, this);
        return resultList;
    }
}

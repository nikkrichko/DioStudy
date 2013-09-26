package lesson_8.Watcher;

import static java.nio.file.FileVisitResult.*;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;


public class Visitor extends SimpleFileVisitor<Path> {
    private WatcherLogger logger = new WatcherLogger();
    private String attributes;
    private Map<Path, FileAttribute> mapOfFiles = new HashMap<>();

    public void fileAttr(Path file){
    FileAttribute fileAttr = new FileAttribute(file.toFile().canExecute(), file.toFile().canWrite(), file.toFile().canRead());
        if (mapOfFiles.get(file) != null && !mapOfFiles.get(file).equals(fileAttr)) {
            FileAttribute oldAttr = mapOfFiles.get(file);
            String logTxt = "change some atrributes";
            if (oldAttr.isExecuted() != fileAttr.isExecuted()) {
                logTxt += " EXECUTE attr changed ";
            }
            if (oldAttr.isRead() != fileAttr.isRead()) {
                logTxt += " READ attr changed ";
            }
            if (oldAttr.isWrite() != fileAttr.isWrite()) {
                logTxt += " WRITE attr changed ";
            }
            logger.log(file + logTxt, "ChAtrrLogger");
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


}

package lesson_8.Watcher;

import static java.nio.file.FileVisitResult.*;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;


public class Visitor extends SimpleFileVisitor<Path> {
    WatcherLogger logger = new WatcherLogger();
    String attributes;
//    public String fileAttr(Path file){
//
//        try {
//        DosFileAttributes attr;
//        attr = Files.readAttributes(file, DosFileAttributes.class);
//        attributes = "isReadOnly is " + attr.isReadOnly() +
//                " isHidden is " + attr.isHidden() +
//                " isArchive is " + attr.isArchive() +
//                " isSystem is " + attr.isSystem();
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//     catch (UnsupportedOperationException x) {
//        System.err.println("DOS file" +
//                " attributes not supported:" + x);
//    }
//    return attributes;
//}


    @Override
    public FileVisitResult visitFile(Path file,
                                     BasicFileAttributes attr) {
        if (file.toString().endsWith(".file")){
//            logger.log(fileAttr(file), "FilleAtribute");
//            System.out.println(fileAttr(file));
            System.out.println(file);
        }
        return CONTINUE;
    }


}

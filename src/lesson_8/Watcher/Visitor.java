package lesson_8.Watcher;

import static java.nio.file.FileVisitResult.*;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;


public class Visitor extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file,
                                     BasicFileAttributes attr) {
        if (file.toString().endsWith(".file"))
            System.out.println(file);
        return CONTINUE;
    }
}

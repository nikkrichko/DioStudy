package lesson_8.Watcher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        Path startingDir = Paths.get("");
        Visitor pf = new Visitor();
        Files.walkFileTree(startingDir, pf);

        Wathcer deserrializator = new Wathcer();
        deserrializator.dessialisatorHelper();
        deserrializator.listenDir();

    }

}

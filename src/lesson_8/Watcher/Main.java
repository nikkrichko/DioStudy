package lesson_8.Watcher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        Path startingDir = Paths.get("");
        Visitor pf = new Visitor();
        for(;;){
            Files.walkFileTree(startingDir, pf);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//
//        Wathcer deserrializator = new Wathcer();
//        deserrializator.dessialisatorHelper();
//        deserrializator.listenDir();

    }

}

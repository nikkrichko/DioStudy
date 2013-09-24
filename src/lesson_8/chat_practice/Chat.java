package lesson_8.chat_practice;


import java.io.*;
import java.nio.file.*;

import static java.nio.file.StandardWatchEventKinds.*;

public class Chat {
    User currentUser;
    WatchService watcher;

    public Chat() {
         try {
             watcher = FileSystems.getDefault().newWatchService();
         } catch (IOException e) {
              e.printStackTrace();
         }
    }

    public static void main(String[] args) throws IOException {

        Chat deserrializator = new Chat();
        deserrializator.dessialisatorHelper();
        deserrializator.listenDir();



    }

    private void dessialisatorHelper() throws IOException {


        Path dir = Paths.get("");
        System.out.println("ololo");
        System.out.println(dir.toAbsolutePath());
        try {
            dir.register(watcher, ENTRY_CREATE);
        } catch (IOException x) {
            System.err.println(x);
        }
    }

    private void listenDir(){
        prepareUser();
        for(;;){
            createSomeText();
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
                    deserrializator(filename);

                }
                key.reset();
            }

        }
    }

    private void deserrializator(Path filename){
        Massage someMassage;
        try{
            InputStream inputStreamReader = new FileInputStream(filename.toFile());
            ObjectInputStream oir = new ObjectInputStream(inputStreamReader);
            someMassage = (Massage) oir.readObject();
            System.out.println(someMassage.toString());

        }
        catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void createSomeText() {
        Massage newMassage = new Massage();
        newMassage.user = currentUser;
        System.out.print("MASSAGE: ");
        Reader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        try{
            newMassage.setText(br.readLine());
                }catch ( IOException e) {

            }


        try {
            OutputStream outputStream = new FileOutputStream(newMassage.date.getTime()+".file");
            ObjectOutputStream oos = new ObjectOutputStream(outputStream);
            oos.writeObject(newMassage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void prepareUser(){
        User newUser = new User();
        System.out.print("LOGIN: ");
        Reader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        try{
            newUser.setLogin(br.readLine());
        }catch ( IOException e) {

        }
        currentUser = newUser;
    }

}



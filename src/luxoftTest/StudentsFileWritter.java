package luxoftTest;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Nikita
 * Date: 11.09.13
 * Time: 13:11
 * To change this template use File | Settings | File Templates.
 */
public class StudentsFileWritter {


    public static void writeStudent(List<Student> students){
        try {
            FileWriter writer = new FileWriter("StudentsOutput.txt");
            for (int i = 0; i < students.size(); i++){
            writer.write("stud id: " + students.get(i).getId() + " Score: " + students.get(i).getScore() + "\n");


            }
            System.out.println("file created");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}

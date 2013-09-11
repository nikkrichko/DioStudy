package luxoftTest;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: b0noI
 * Date: 11.09.13
 * Time: 08:11
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) throws IOException {

<<<<<<< HEAD
        StudentsFileReader studentsFileReader = new StudentsFileReader("StRate.txt");
        List<Student> students = studentsFileReader.readStudents();

        Student.deleteCopy(students);

        for(int i = 0; i < students.size(); i++){
            System.out.println("stud id: " + students.get(i).getId() + " Score: " + students.get(i).getScore());

        }

        StudentsFileWritter.writeStudent(students);



=======
        StudentsFileReader studentsFileReader = new StudentsFileReader("sdfsd");
        List<Student> students = studentsFileReader.readStudents();

>>>>>>> a4864d5812cf6981571fab670ad116ccd1daf21b
    }

}

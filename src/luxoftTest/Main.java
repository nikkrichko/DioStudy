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

        StudentsFileReader studentsFileReader = new StudentsFileReader("sdfsd");
        List<Student> students = studentsFileReader.readStudents();

    }

}

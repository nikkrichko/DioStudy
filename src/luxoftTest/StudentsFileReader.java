package luxoftTest;

import java.io.*;
import java.util.*;

public class StudentsFileReader {

    private final String path;

    public StudentsFileReader(String path) {
        this.path = path;
    }

    public List<Student> readStudents() throws IOException {

        List<Student> students = new ArrayList<Student>();

        Reader reader = new java.io.FileReader(path);
        BufferedReader br = new BufferedReader(reader);
        String line;
        while ((line = br.readLine()) != null) {
            students.add(Student.generateStudent(line));
        }

        Collections.sort(students);
        return students;
    }

}

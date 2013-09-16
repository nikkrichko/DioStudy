package luxoftTest.studentsReverse;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {


        StudentsFileReader studentsFileReader = new StudentsFileReader("StRate.txt");
        List<Student> students = studentsFileReader.readStudents();

        Student.deleteCopy(students);

        for(int i = 0; i < students.size(); i++){
            System.out.println("stud id: " + students.get(i).getId() + " Score: " + students.get(i).getScore());

        }

        StudentsFileWritter.writeStudent(students);



    }

}

class Student implements Comparable<Student>{


    private static final int MIN_STUDENT_DATA_SIZE = 3;
    private static final String STRING_FOR_SPLITING = "-";
    private int id;
    private int score;


    private Student (int id, int score){
        this.id = id;
        this.score = score;
    }

    public static Student generateStudent(String studentData){

        if (studentData == null || studentData.length() < MIN_STUDENT_DATA_SIZE)
            throw new IllegalArgumentException("chech your data dear student!!!");

        String[] studentDataMas = studentData.split(STRING_FOR_SPLITING);
        if (studentDataMas.length != 2)
            throw new IllegalArgumentException("ne tot razmer massiva");

        int id = Integer.valueOf(studentDataMas[0]);
        int score = Integer.valueOf(studentDataMas[1]);

        return new Student(id, score);

    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student o) {
        return o.getScore()-getScore();
    }

    @Override
    public String toString() {
        return id + "-" + score;
    }

    static boolean checkPrevious(List<Student> array, int j){
        for (int i = 0; i < j; i++){
            if (array.get(i).getId() == array.get(j).getId()) {
                if (array.get(i).getScore() > array.get(j).getScore()){
                    array.remove(j);
                } else {
                    array.remove(i);
                }
                return true;
            }

        }
        return false;

    }

    static void deleteCopy(List<Student> array){
        for (int i=0; i< array.size(); i++){
            if (checkPrevious(array, i))
                i--;

        }
    }
}



class StudentsFileReader {

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

class StudentsFileWritter {


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





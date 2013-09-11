package luxoftTest;
import java.util.List;

public class Student implements Comparable<Student>{


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





    static void checkPrevious(List<Student> array, int j){
        for (int i = 0; i < j; i++){
            if (array.get(i).getId() == array.get(j).getId())
                if (array.get(i).getScore() > array.get(j).getScore()){
                    array.remove(j);
                } else {
                    array.remove(j);
                }

        }

    }

     static void deleteCopy(List<Student> array){
         for (int i=0; i< array.size(); i++){
             checkPrevious(array, i);

             }
         }
}




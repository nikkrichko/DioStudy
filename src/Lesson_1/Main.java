package Lesson_1;

/**
 * Created with IntelliJ IDEA.
 * User: Nikita
 * Date: 04.09.13
 * Time: 11:20
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {


        MyPojo man = new MyPojo.Builder().setName("nikita").setAge(25).setSalary(1000).build();
        System.out.println(man);



    }
}

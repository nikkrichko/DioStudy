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


        MyPojo man = new MyPojo.Builder().Name("nikita").Age(25).Salary(1000).build();
        System.out.println(man);

        MyPojo copyMan = new MyPojo.Builder().populate(man).build();
        System.out.println(copyMan);

        MyPojo copyRast = new MyPojo.Builder().populate(man).Age(18).Salary(9999999).build();
        System.out.println(copyRast);

    }
}

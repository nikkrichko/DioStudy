package lesson_1;

/**
 * Created with IntelliJ IDEA.
 * User: Nikita
 * Date: 04.09.13
 * Time: 11:20
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {


        MyPojo man = new MyPojoImpl.Builder().name("nikita").age(25).salary(1000).build();
        System.out.println(man);

        MyPojo copyMan = new MyPojoImpl.Builder().populate(man).build();
        System.out.println(copyMan);

        MyPojoImpl.Builder builder = new MyPojoImpl.Builder();
        builder.build();

        MyPojo copyRast = new MyPojoImpl.Builder().populate(man).age(18).salary(9999999).build();
        System.out.println(copyRast);

    }


}

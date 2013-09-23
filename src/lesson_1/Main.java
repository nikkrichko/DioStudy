package lesson_1;

// test of VCS from ubuntu
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

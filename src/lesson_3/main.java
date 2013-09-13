package lesson_3;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        MyPojo Human_01 = new MyPojoImpl.Builder().name("Bender").age(20).salary(1000).build();
        MyPojo Human_02 = new MyPojoImpl.Builder().name("Ivanov").age(22).salary(3000).build();
        MyPojo Human_03 = new MyPojoImpl.Builder().name("DeNiro").age(25).salary(2000).build();
        MyPojo Human_04 = new MyPojoImpl.Builder().name("Sidorov").age(28).salary(2000).build();
        MyPojo Human_05 = new MyPojoImpl.Builder().name("Simpson").age(24).salary(4000).build();
        MyPojo Human_06 = new MyPojoImpl.Builder().name("Pachino").age(35).salary(8000).build();
        MyPojo Human_07 = new MyPojoImpl.Builder().name("DeNiro").age(48).salary(9000).build();
        MyPojo Human_08 = new MyPojoImpl.Builder().name("Stethem").age(50).salary(8000).build();
        MyPojo Human_09 = new MyPojoImpl.Builder().name("Freman").age(31).salary(4000).build();
        MyPojo Human_10 = new MyPojoImpl.Builder().name("Bender").age(20).salary(1000).build();


        ArrayList<MyPojo> HumansLeft = new ArrayList<MyPojo>();
        ArrayList<MyPojo> HumansRight = new ArrayList<MyPojo>();
        HumansLeft.add(Human_01);
        HumansLeft.add(Human_02);
        HumansLeft.add(Human_03);
        HumansLeft.add(Human_04);
        HumansLeft.add(Human_05);

        HumansRight.add(Human_06);
        HumansRight.add(Human_07);
        HumansRight.add(Human_08);
        HumansRight.add(Human_09);
        HumansRight.add(Human_10);


        for ( int i = 0; i < HumansLeft.size(); i++){
        System.out.println(HumansLeft.get(i).toString());}

        System.out.println();

        for ( int i = 0; i < HumansRight.size(); i++){
            System.out.println(HumansRight.get(i).toString());}

        ArrayList<MyPojo> ResultHumans = new ArrayList<MyPojo>();

        ResultHumans.addAll(HumansLeft);
        ResultHumans.addAll(HumansRight);

        System.out.println("***RESULT***");

        for ( int i = 0; i < ResultHumans.size(); i++){
            System.out.println(ResultHumans.get(i).toString());}


    }
}

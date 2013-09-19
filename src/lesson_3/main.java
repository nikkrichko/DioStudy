package lesson_3;


import lesson_3.Comparator.AgeComaprator;
import lesson_3.Comparator.SalaryComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Comparator<MyPojo> ageComparator = new SalaryComparator();
        MyPojo human_01 = new MyPojoImpl.Builder().name("Bender").age(20).salary(1000).comparator(ageComparator).build();
        MyPojo human_02 = new MyPojoImpl.Builder().name("DeNiro").age(25).salary(3000).comparator(ageComparator).build();
        MyPojo human_03 = new MyPojoImpl.Builder().name("DeNiro").age(25).salary(2000).comparator(ageComparator).build();
        MyPojo Human_04 = new MyPojoImpl.Builder().name("Sidorov").age(28).salary(2000).comparator(ageComparator).build();
        MyPojo Human_05 = new MyPojoImpl.Builder().name("Simpson").age(24).salary(4000).comparator(ageComparator).build();
        MyPojo Human_06 = new MyPojoImpl.Builder().name("Pachino").age(35).salary(8000).comparator(ageComparator).build();
        MyPojo Human_07 = new MyPojoImpl.Builder().name("DeNiro").age(48).salary(9000).comparator(ageComparator).build();
        MyPojo Human_08 = new MyPojoImpl.Builder().name("Stethem").age(50).salary(8000).comparator(ageComparator).build();
        MyPojo Human_09 = new MyPojoImpl.Builder().name("Freman").age(31).salary(4000).comparator(ageComparator).build();
        MyPojo Human_10 = new MyPojoImpl.Builder().name("Bender").age(20).salary(1000).comparator(ageComparator).build();


        List<MyPojo> HumansLeft = new ArrayList<>();
        List<MyPojo> HumansRight = new ArrayList<>();
        HumansLeft.add(human_01);
        HumansLeft.add(human_02);
        HumansLeft.add(human_03);
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


        Set<MyPojo> resultHumans = new HashSet<>();

        resultHumans.addAll(HumansLeft);
        resultHumans.addAll(HumansRight);

        System.out.println("***RESULT_without_dublicate***");

        for ( MyPojo myPojo : resultHumans) {
            System.out.println(myPojo);
        }

        List<MyPojo> resultList = new ArrayList<>();
        resultList.addAll(resultHumans);


        Comparator<MyPojo> nameComparator = new Comparator<MyPojo>(){

            @Override
            public int compare(MyPojo o1, MyPojo o2) {

                if (!o1.getName().equals(o2.getName()))
                    return o1.getName().compareTo(o2.getName());

                if (o1.getAge() != o2.getAge())
                    return o1.getAge() - o2.getAge();

                if (o1.getSalary() != o2.getSalary())
                    return o1.getSalary() - o2.getSalary();

                return 0;
            }

        };

        Collections.sort(resultList, nameComparator);

        System.out.println("***SORTED RESULT***");

        for ( MyPojo myPojo : resultList) {
            System.out.println(myPojo);
        }

    }
}

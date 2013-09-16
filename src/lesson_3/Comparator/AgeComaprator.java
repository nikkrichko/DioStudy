package lesson_3.Comparator;


import lesson_3.MyPojo;

import java.util.Comparator;

public class AgeComaprator implements Comparator<MyPojo> {
    @Override
    public int compare(MyPojo o1, MyPojo o2) {

        return o1.getAge() - o2.getAge();
    }
}

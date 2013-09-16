package lesson_3.Comparator;


import lesson_3.MyPojo;

import java.util.Comparator;

public class SalaryComparator implements Comparator<MyPojo> {
    @Override
    public int compare(MyPojo o1, MyPojo o2) {
        return o1.getSalary() - o2.getSalary();
    }
}

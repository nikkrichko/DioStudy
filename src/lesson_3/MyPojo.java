package lesson_3;


import java.util.Comparator;

public interface MyPojo extends Comparable<MyPojo> {

    public String getName();

    public int getAge();

    public int getSalary();

    public Comparator<MyPojo> getComparator();

    public Size getSize();

}

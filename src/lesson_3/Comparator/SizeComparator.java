package lesson_3.Comparator;

import lesson_3.MyPojo;

import java.util.Comparator;

public class SizeComparator implements Comparator<MyPojo> {

    @Override
    public int compare(MyPojo o1, MyPojo o2) {
        if (o1.getSize().high != o2.getSize().high)
            return o1.getSize().high - o2.getSize().high;
        return o1.getSize().weight - o2.getSize().weight;
    }

}

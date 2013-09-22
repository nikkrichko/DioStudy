package lesson_8.Serrialization;


import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class Massage implements Serializable {

    private static int SIZE = 12;
    private int[] array = new int[SIZE];
    private transient Date date = new Date();

    public void setPosition(int position, int value){
        array[position] = value;
    }

    public int getPosition(int position){
       return array[position];
    }

    public int getMaxSize(){
        return SIZE;
    }

    @Override
    public String toString() {
        return "Massage{" +
                "array=" + Arrays.toString(array) +
                ", date=" + date +
                ", SIZE=" + SIZE +
                '}';
    }
}

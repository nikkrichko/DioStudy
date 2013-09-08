package lesson_2;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: b0noI
 * Date: 08.09.13
 * Time: 14:30
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        ArrayHelper.populateArrayRandom(array1, 25);
        ArrayHelper.populateArrayRandom(array2, 20);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("++++");
        System.out.println("Result:");
        System.out.println("++++");

        System.out.println(" merge" + Arrays.toString(ArrayHelper.merge(array1, array2)));
        System.out.println(" innerJoin" + Arrays.toString(ArrayHelper.innerJoin(array1, array2)));
        System.out.println(" leftJoin" + Arrays.toString(ArrayHelper.leftJoin(array1, array2)));
        System.out.println(" outerJoin" + Arrays.toString(ArrayHelper.outerJoin(array1, array2)));

    }
}

package lesson_2;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;


public class ArrayHelperTest {
    @Test
    public void testPopulateArrayRandom() throws Exception {
        int arraySize = 1000;
        int maxValueRandom = 25;
        int[] inputValue = new int[arraySize];

        ArrayHelper.populateArrayRandom(inputValue, maxValueRandom);
        for (int i = 0; i < arraySize; i++){
            assertTrue(inputValue[i] > 0 && inputValue[i] <= maxValueRandom);
        }
//        System.out.println(Arrays.toString(inputValue));

    }

    @Test
    public void testGenerateRandomInt() throws Exception {
        int inputValue = 5;
        for(int i = 0; i < 100000; i++){
            int actualResult = ArrayHelper.generateRandomInt(inputValue);
            assertTrue(actualResult > 0 && actualResult <= inputValue);
//            System.out.print(actualResult + ", ");
        }

    }

    @Test
    public void testIsValueInArray() throws Exception{
         int[] inputvalue = {2,5,7,9,5};
         int targetValueTrue = 2;
         int targetValueWrong = 3;

        assertTrue(ArrayHelper.isValueInArray(inputvalue, targetValueTrue));
        assertFalse(ArrayHelper.isValueInArray(inputvalue, targetValueWrong));

    }

    @Test
    public void testCountDublicat() throws Exception{
        int[] m1 = {1, 3, 5, 6, 7};
        int[] m2 = {3, 4, 5, 9};
        int actualResult = ArrayHelper.countDublicate(m1, m2);
        assertEquals(2, actualResult);

    }

    @Test
    public void testMerge() throws Exception{
        int[] m1 = {1, 3, 5, 6, 7};
        int[] m2 = {3, 4, 5, 9, 3};
        int[] m3 = ArrayHelper.merge(m1, m2);
        int[] expectedResult = {1, 3, 4, 5, 6, 7, 9};
        System.out.println(Arrays.toString(m3));
        assertTrue(Arrays.equals(m3, expectedResult));
    }


    @Test
    public void testMerge1() throws Exception{
        int[] m1 = {1, 3, 5, 6, 7};
        int[] m2 = {3, 4, 5, 9, 3};
        int[] m3 = ArrayHelper.merge1(m1, m2);
        int[] expectedResult = {1, 3, 5, 6, 7, 4, 9};
        System.out.println(Arrays.toString(m3));
        assertTrue(Arrays.equals(m3, expectedResult));
    }

    @Test
    public void testInnerJoin() throws Exception{

        int[] m1 = {1, 3, 5, 6, 7};
        int[] m2 = {3, 4, 5, 9, 3};
        int[] m3 = ArrayHelper.innerJoin(m1, m2);
        int[] expectedResult = {3,5};
        System.out.println(Arrays.toString(ArrayHelper.innerJoin(m1,m2)));
        assertTrue(Arrays.equals(m3, expectedResult));
    }

    @Test
    public  void testLeftJoin() throws Exception{

        int[] m1 = {1, 3, 5, 6, 7};
        int[] m2 = {3, 4, 5, 6, 3};
        int[] m3 = ArrayHelper.leftJoin(m1, m2);
        int[] expectedResult = {1, 3, 5, 6, 7, 3, 5, 6, 3};
        System.out.println(Arrays.toString(ArrayHelper.leftJoin(m1,m2)));
        assertTrue(Arrays.equals(m3, expectedResult));
    }

    @Test
    public void testOuterJoin() throws Exception{

        int[] m1 = {1, 3, 5, 6, 7};
        int[] m2 = {3, 4, 5, 9, 3};
        int[] m3 = ArrayHelper.outerJoin(m1, m2);
        int[] expectedResult = {1, 6, 7, 4, 9};
        System.out.println(Arrays.toString(ArrayHelper.outerJoin(m1,m2)));
        assertTrue(Arrays.equals(m3, expectedResult));
    }


    @Test
    public void testTime() throws  Exception{
        int arraySize = 10000000;

        int[] array1 = new int[arraySize];
        int[] array2 = new int[arraySize];

        ArrayHelper.populateArrayRandom(array1, 100);
        ArrayHelper.populateArrayRandom(array2, 100);

//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
        System.out.println("++++");
        System.out.println("Result:");
        System.out.println("++++");


        ArrayHelper.merge1(array1, array2);
//        System.out.println(" merge" + Arrays.toString(ArrayHelper.merge(array1, array2)));
    }

}

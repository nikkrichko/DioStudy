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
        System.out.println(Arrays.toString(inputValue));

    }

    @Test
    public void testGenerateRandomInt() throws Exception {
        int inputValue = 5;
        for(int i = 0; i < 100000; i++){
            int actualResult = ArrayHelper.generateRandomInt(inputValue);
            assertTrue(actualResult > 0 && actualResult <= inputValue);
            System.out.print(actualResult + ", ");
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
        int[] m2 = {3, 4, 5, 9, 3};
        int actualResult = ArrayHelper.countDublicate(m1, m2);
        assertEquals(3, actualResult);

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

}

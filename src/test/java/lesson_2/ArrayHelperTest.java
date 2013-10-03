package lesson_2;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.*;


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


//    int[] m1 = {1, 3, 5, 6, 1};
//    int[] m2 = {3, 4, 5, 9, 3};
//
//    int[] m1 = {1, 3, 5, 6, 1};
//    int[] m2 = {1, 4, 5, 9, 1};
//
//    int[] m1 = {1, 2, 3, 4, 5};
//    int[] m2 = {6, 7, 8, 9, 10};
//
//    int[] m1 = {1, 3, 5, 6, 7};
//    int[] m2 = {3, 4, 5, 9, 3};

    @Test
    public void testMergeWithSort() throws Exception{
        int[] m1 = {3, 1, 5, 6, 7};
        int[] m2 = {3, 4, 5, 9, 3};
        int[] m3 = ArrayHelper.mergeWithSort(m1, m2);
        int[] expectedResult = {1, 3, 4, 5, 6, 7, 9};
        System.out.println(Arrays.toString(m3));
        assertTrue(Arrays.equals(m3, expectedResult));
    }

//    @Test
//    public void testMergeWithSort_NULL_ARRAY() throws Exception{
//
//        int[] m1 = {1, 3, 5, 6, 7};
//        int[] m2 = null;
//
//        int[] m3 = ArrayHelper.mergeWithSort(m1, m2);
//
////        int[] expectedResult = {1, 3, 4, 5, 6, 7, 9};
////        System.out.println(Arrays.toString(m3));
////        assertTrue(Arrays.equals(m3, expectedResult));
//
//    }

    @Test
    public void testMergeWithSort_Dublicat_in_first_and_second_Array() throws Exception{
    int[] m1 = {3, 1, 5, 6, 1};
    int[] m2 = {3, 4, 5, 9, 3};
    int[] m3 = ArrayHelper.mergeWithSort(m1, m2);
    int[] expectedResult = {1, 3, 4, 5, 6, 9};
    System.out.println(Arrays.toString(m3));
    assertTrue(Arrays.equals(m3, expectedResult));
    }

    @Test
    public void testMergeWithSort_without_Dublicats() throws Exception{
        int[] m1 = {2, 1, 5, 4, 3};
        int[] m2 = {9, 8, 7, 6, 10};
        int[] m3 = ArrayHelper.mergeWithSort(m1, m2);
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(m3));
        assertTrue(Arrays.equals(m3, expectedResult));
    }

    @Test
    public void testMergeWithoutSort() throws Exception{
        int[] m1 = {1, 3, 5, 6, 7};
        int[] m2 = {3, 4, 5, 9, 3};
        int[] m3 = ArrayHelper.mergeWithoutSort(m1, m2);
        int[] expectedResult = {1, 3, 5, 6, 7, 4, 9};
        System.out.println(Arrays.toString(m3));
        assertTrue(Arrays.equals(m3, expectedResult));
    }

    @Test
    public void testMergeWithoutSort_Dublicat_in_first_and_second_Array() throws Exception{
        int[] m1 = {3, 1, 5, 6, 1};
        int[] m2 = {3, 4, 5, 9, 3};
        int[] m3 = ArrayHelper.mergeWithoutSort(m1, m2);
        int[] expectedResult = {3, 1, 5, 6, 4, 9};
        System.out.println(Arrays.toString(m3));
        assertTrue(Arrays.equals(m3, expectedResult));
    }

    @Test
    public void testMergeWithoutSort_without_Dublicats() throws Exception{
        int[] m1 = {2, 1, 5, 4, 3};
        int[] m2 = {9, 8, 7, 6, 10};
        int[] m3 = ArrayHelper.mergeWithoutSort(m1, m2);
        int[] expectedResult = {2, 1, 5, 4, 3, 9, 8, 7, 6, 10};
        System.out.println(Arrays.toString(m3));
        assertTrue(Arrays.equals(m3, expectedResult));
    }



    @Test
    public void testInnerJoin_normal_mode() throws Exception{

        int[] m1 = {1, 3, 5, 6, 7};
        int[] m2 = {3, 4, 5, 9, 3};
        int[] m3 = ArrayHelper.innerJoin(m1, m2);
        int[] expectedResult = {3,5};
        System.out.println(Arrays.toString(ArrayHelper.innerJoin(m1,m2)));
        assertTrue(Arrays.equals(m3, expectedResult));
    }

    @Test
    public void testInnerJoin_dublicat_in_first() throws Exception{

        int[] m1 = {1, 3, 5, 6, 3};
        int[] m2 = {3, 4, 7, 9, 10};
        int[] m3 = ArrayHelper.innerJoin(m1, m2);
        int[] expectedResult = {3,3};
        System.out.println(Arrays.toString(ArrayHelper.innerJoin(m1,m2)));
        assertTrue(Arrays.equals(m3, expectedResult));
    }

    @Test
    public void testInnerJoin_Dublicat_in_Second() throws Exception{

        int[] m1 = {1, 2, 4, 5, 11};
        int[] m2 = {3, 7, 10, 9, 3};
        int[] m3 = ArrayHelper.innerJoin(m1, m2);
        int[] expectedResult = {};
        System.out.println(Arrays.toString(ArrayHelper.innerJoin(m1,m2)));
        assertTrue(Arrays.equals(m3, expectedResult));
    }

    @Test
    public void testInnerJoin_Dublicats_in_both() throws Exception{

        int[] m1 = {1, 3, 5, 6, 3};
        int[] m2 = {3, 4, 5, 9, 3};
        int[] m3 = ArrayHelper.innerJoin(m1, m2);
        int[] expectedResult = {3,5,3};
        System.out.println(Arrays.toString(ArrayHelper.innerJoin(m1,m2)));
        assertTrue(Arrays.equals(m3, expectedResult));
    }

    @Test
    public void testInnerJoin_without_dublicats() throws Exception{

        int[] m1 = {1, 2, 3, 4, 5};
        int[] m2 = {6, 7, 8, 9, 10};
        int[] m3 = ArrayHelper.innerJoin(m1, m2);
        int[] expectedResult = { };
        System.out.println(Arrays.toString(ArrayHelper.innerJoin(m1,m2)));
        assertTrue(Arrays.equals(m3, expectedResult));
    }



//    Start test LeftJoin
    @Test
    public  void testLeftJoin_normal_mode() throws Exception{

        int[] m1 = {1, 3, 5, 6, 7};
        int[] m2 = {3, 4, 5, 6, 3};
        int[] m3 = ArrayHelper.leftJoin(m1, m2);
        int[] expectedResult = {1, 3, 5, 6, 7, 3, 5, 6, 3};
        System.out.println(Arrays.toString(ArrayHelper.leftJoin(m1,m2)));
        assertTrue(Arrays.equals(m3, expectedResult));
    }

    @Test
    public  void testLeftJoin_dublicats_in_first() throws Exception{

        int[] m1 = {1, 2, 3, 4, 3};
        int[] m2 = {5, 6, 7, 8, 9};
        int[] m3 = ArrayHelper.leftJoin(m1, m2);
        int[] expectedResult = {1, 2, 3, 4, 3};
        System.out.println(Arrays.toString(ArrayHelper.leftJoin(m1,m2)));
        assertTrue(Arrays.equals(m3, expectedResult));
    }
    @Test
    public  void testLeftJoin_Dublicats_in_Second() throws Exception{

        int[] m1 = {1, 2, 3, 4, 5};
        int[] m2 = {10, 4, 7, 8, 9};
        int[] m3 = ArrayHelper.leftJoin(m1, m2);
        int[] expectedResult = {1, 2, 3, 4, 5, 4};
        System.out.println(Arrays.toString(ArrayHelper.leftJoin(m1,m2)));
        assertTrue(Arrays.equals(m3, expectedResult));
    }
    @Test
    public  void testLeftJoin_Dublicats_in_both() throws Exception{

        int[] m1 = {1, 3, 3, 4, 5};
        int[] m2 = {6, 7, 8, 9, 6};
        int[] m3 = ArrayHelper.leftJoin(m1, m2);
        int[] expectedResult = {1, 3, 3, 4, 5};
        System.out.println(Arrays.toString(ArrayHelper.leftJoin(m1,m2)));
        assertTrue(Arrays.equals(m3, expectedResult));
    }
    @Test
    public  void testLeftJoin_with_out_Dublicats() throws Exception{

        int[] m1 = {1, 2, 3, 4, 5};
        int[] m2 = {6, 7, 8, 9, 10};
        int[] m3 = ArrayHelper.leftJoin(m1, m2);
        int[] expectedResult = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(ArrayHelper.leftJoin(m1,m2)));
        assertTrue(Arrays.equals(m3, expectedResult));
    }

    @Test
    public void testOuterJoin_normal_mode() throws Exception{

        int[] m1 = {1, 3, 5, 6, 7};
        int[] m2 = {3, 4, 5, 9, 3};
        int[] m3 = ArrayHelper.outerJoin(m1, m2);
        int[] expectedResult = {1, 6, 7, 4, 9};
        System.out.println(Arrays.toString(ArrayHelper.outerJoin(m1,m2)));
        assertTrue(Arrays.equals(m3, expectedResult));
    }

    @Test
    public void testOuterJoin_Dublicats_in_first() throws Exception{

        int[] m1 = {1, 2, 3, 4, 4};
        int[] m2 = {5, 6, 7, 9, 8};
        int[] m3 = ArrayHelper.outerJoin(m1, m2);
        int[] expectedResult = {1, 2, 3, 4, 5,6,7,9,8};
        System.out.println(Arrays.toString(ArrayHelper.outerJoin(m1,m2)));
        assertTrue(Arrays.equals(m3, expectedResult));
    } // FIND ERROR CHANGE CODE


    @Test
    public void testOuterJoin_Dublicats_in_Second() throws Exception{

        int[] m1 = {1, 2, 3, 4, 5};
        int[] m2 = {3, 4, 6, 9, 3};
        int[] m3 = ArrayHelper.outerJoin(m1, m2);
        int[] expectedResult = {1, 2, 5, 6, 9};
        System.out.println(Arrays.toString(ArrayHelper.outerJoin(m1,m2)));
        assertTrue(Arrays.equals(m3, expectedResult));
    }


    @Test
    public void testOuterJoin_Dublicats_in_Both() throws Exception{

        int[] m1 = {1, 2, 3, 4, 6};
        int[] m2 = {5, 6, 5, 9, 7};
        int[] m3 = ArrayHelper.outerJoin(m1, m2);
        int[] expectedResult = {1, 2, 3, 4, 5,9,7};
        System.out.println(Arrays.toString(ArrayHelper.outerJoin(m1,m2)));
        assertTrue(Arrays.equals(m3, expectedResult));
    } // Find error change code

    @Test
    public void testOuterJoin_without_Dublicats() throws Exception{

        int[] m1 = {1, 2, 3, 4, 5};
        int[] m2 = {6, 7,8, 9, 10};
        int[] m3 = ArrayHelper.outerJoin(m1, m2);
        int[] expectedResult = {1, 2, 3, 4, 5,6,7,8,9,10};
        System.out.println(Arrays.toString(ArrayHelper.outerJoin(m1,m2)));
        assertTrue(Arrays.equals(m3, expectedResult));
    }



}

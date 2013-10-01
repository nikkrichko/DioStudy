package lesson_practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static junit.framework.Assert.*;


public class ServiceHelperTest {
    MyPojoImpl human_01 = new MyPojoImpl("Goodman", 18, 2000);
    MyPojoImpl human_02 = new MyPojoImpl("Badman", 20, 45);
    MyPojoImpl human_03 = new MyPojoImpl("Ratman", 23, 250);
    MyPojoImpl human_04 = new MyPojoImpl("Batman", 54, 6574);
    MyPojoImpl human_05 = new MyPojoImpl("Superman", 76, 800);
    MyPojoImpl human_06 = new MyPojoImpl("GoldMan", 35, 77000);

    @Test
    public void testInnerJoin() throws Exception {
        List<MyPojoImpl> leftList = new ArrayList<MyPojoImpl>(Arrays.asList(human_01,human_02,human_03,human_04, human_02, human_02, human_06));
        List<MyPojoImpl> rightList = new ArrayList<MyPojoImpl>(Arrays.asList(human_06, human_01, human_01));

        ServiceHelper serviceHelperTest = new ServiceHelper();
        List<MyPojoImpl> resultListTest = serviceHelperTest.innerJoin(leftList, rightList);
        List<MyPojoImpl> expectedList = Arrays.asList(human_01,human_06, human_06, human_01, human_01);
        assertTrue(expectedList.equals(resultListTest));
    }

    @Test
    public void testRemoveDublicate() throws Exception {
        List<MyPojoImpl> leftList = new ArrayList<MyPojoImpl>(Arrays.asList(human_01,human_02,human_01,human_03, human_02, human_03));

        ServiceHelper serviceHelperTest = new ServiceHelper();
        List<MyPojoImpl> resultListTest = serviceHelperTest.removeDublicate(leftList);
        List<MyPojoImpl> expectedList = Arrays.asList(human_01, human_02, human_03);

        assertTrue(expectedList.equals(resultListTest));
    }

    @Test
    public void testSortList() throws Exception {

        List<MyPojoImpl> inList = new ArrayList<MyPojoImpl>(Arrays.asList(human_01,human_02,human_03,human_04,human_06,human_05));

        ServiceHelper serviceHelperTest = new ServiceHelper();
        serviceHelperTest.sortList(inList);
        List<MyPojoImpl> resultListTest = inList;
        List<MyPojoImpl> expectedList = Arrays.asList(human_02,human_03,human_06,human_01,human_04,human_05);

        assertTrue(expectedList.equals(resultListTest));

    }
}

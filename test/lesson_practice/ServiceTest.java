package lesson_practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class ServiceTest {

    MyPojoImpl human_01 = new MyPojoImpl("1Goodman", 18, 2000);
    MyPojoImpl human_02 = new MyPojoImpl("2Badman", 20, 45);
    MyPojoImpl human_03 = new MyPojoImpl("3Ratman", 23, 250);
    MyPojoImpl human_04 = new MyPojoImpl("4Batman", 54, 6574);
    MyPojoImpl human_05 = new MyPojoImpl("5Superman", 76, 800);
    MyPojoImpl human_06 = new MyPojoImpl("6GoldMan", 35, 77000);

    @Test
    public void testServiceList() throws Exception {
        List<MyPojoImpl> leftList = new ArrayList<MyPojoImpl>(Arrays.asList(human_01, human_02, human_04, human_02, human_02, human_06));
        List<MyPojoImpl> rightList = new ArrayList<MyPojoImpl>(Arrays.asList(human_06, human_01, human_01));
        List<MyPojoImpl> expectedList = Arrays.asList(human_01,human_06);

        // mock
        ServiceHelper serviceHelper = mock(ServiceHelper.class);
        when(serviceHelper.removeDublicate(null)).thenReturn(expectedList);
        when(serviceHelper.innerJoin(any(List.class), anyList())).thenReturn(null);


        Service serviceTest = new Service(serviceHelper);
        List<MyPojoImpl> resultListTest = serviceTest.serviceList(leftList, rightList);
        assertTrue(expectedList.equals(resultListTest));
        verify(serviceHelper).sortList(expectedList);

    }
}

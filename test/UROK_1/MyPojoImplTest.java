package UROK_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: b0noI
 * Date: 04.09.13
 * Time: 20:10
 * To change this template use File | Settings | File Templates.
 */
public class MyPojoImplTest {
    @Test
    public void testBuildHuman() throws Exception {
         MyPojo testClass = new MyPojoImpl.Builder()
                 .name("testName")
                 .age(99)
                 .salary(1000)
                 .build();

        assertEquals("testName",testClass.getName());
        assertEquals(99, testClass.getAge());
        assertEquals(1000, testClass.getSalary());

    }

    @Test
    public void testPopulate() throws Exception {
        MyPojo inputValue = new MyPojoImpl.Builder()
                .name("testName")
                .age(99)
                .salary(1000)
                .build();

        MyPojo testClass = new MyPojoImpl.Builder().populate(inputValue).build();

        assertEquals("testName",testClass.getName());
        assertEquals(99, testClass.getAge());
        assertEquals(1000, testClass.getSalary());
    }

    @Test
    public void testGetSalary() throws Exception {

    }

    @Test
    public void testToString() throws Exception {

    }
}

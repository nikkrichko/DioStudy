package lesson_practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MyPojoImpl human_01 = new MyPojoImpl("Goodman", 18, 2000);
        MyPojoImpl human_02 = new MyPojoImpl("Badman", 20, 45);
        MyPojoImpl human_03 = new MyPojoImpl("Ratman", 23, 250);
        MyPojoImpl human_04 = new MyPojoImpl("Batman", 54, 6574);
        MyPojoImpl human_05 = new MyPojoImpl("Superman", 76, 800);
        MyPojoImpl human_06 = new MyPojoImpl("GoldMan", 35, 77000);

        List<MyPojoImpl> leftList = new ArrayList<MyPojoImpl>(Arrays.asList(human_01, human_02, human_03, human_04, human_02, human_02, human_06));
        List<MyPojoImpl> rightList = new ArrayList<MyPojoImpl>(Arrays.asList(human_06, human_02, human_01, human_04,human_01,human_06,human_05,human_03));

        Service resultList = new Service();
        System.out.println(resultList.serviceList(leftList, rightList));


    }
}

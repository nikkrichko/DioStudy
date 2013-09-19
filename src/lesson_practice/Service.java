package lesson_practice;

import java.util.ArrayList;
import java.util.List;

public class Service {

     public List<MyPojoImpl> serviceList (List<MyPojoImpl> leftList, List<MyPojoImpl> rightList){
         ServiceHelper serviceHelper = new ServiceHelper();
         List<MyPojoImpl> resultList = serviceHelper.removeDublicate(serviceHelper.innerJoin(leftList, rightList));
         serviceHelper.sortList(resultList);
         return resultList;
     }

}

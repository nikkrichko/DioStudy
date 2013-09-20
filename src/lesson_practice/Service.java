package lesson_practice;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private ServiceHelper serviceHelper = new ServiceHelper();
    public Service(ServiceHelper serviceHelper){
        this.serviceHelper = serviceHelper;
    }

     public List<MyPojoImpl> serviceList (List<MyPojoImpl> leftList, List<MyPojoImpl> rightList){
         List<MyPojoImpl> resultList = serviceHelper.removeDublicate(serviceHelper.innerJoin(leftList, rightList));
         serviceHelper.sortList(resultList);
         return resultList;
     }

}

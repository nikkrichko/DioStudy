package lesson_practice;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: b0noI
 * Date: 17.09.13
 * Time: 10:41
 * To change this template use File | Settings | File Templates.
 */
public class ServiceHelper {

    public List<MyPojoImpl> innerJoin (List<MyPojoImpl> listLeft, List<MyPojoImpl> listRight){

        List<MyPojoImpl> resultList = new ArrayList<>();


        for(int i =0; i < listLeft.size(); i++ ){
            if (listRight.contains(listLeft.get(i))) {
                resultList.add(listLeft.get(i));
            }
        }

        for (MyPojoImpl element : listRight){
            if (listLeft.contains(element)){
                resultList.add(element);
            }

        }
        return resultList;
    }

    public List<MyPojoImpl> removeDublicate (List<MyPojoImpl> list){
        Set<MyPojoImpl> resultSet = new LinkedHashSet<>();
        resultSet.addAll(list);
        return null;
//        return new ArrayList<>(resultSet);

    }

    public void sortList (List<MyPojoImpl> list){

        Collections.sort(list);
    }

}

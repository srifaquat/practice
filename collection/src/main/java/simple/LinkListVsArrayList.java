package simple;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkListVsArrayList {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        ArrayList<Integer> arrayList =new ArrayList<>();

        for(int i=0;i<1000000 ;i++){
            linkedList.add(i);
            arrayList.add(i);
        }
        //Time check to find mid-values
        checkGetTime(linkedList,linkedList.size()/2 , "LinkedList");
        checkGetTime(arrayList,arrayList.size()/2 , "arrayList");
        checkRemoveTime(linkedList,linkedList.size()/2 , "LinkedList");
        checkRemoveTime(arrayList,arrayList.size()/2 , "arrayList");

        //finding starting values
        checkGetTime(linkedList,10 , "LinkedList");
        checkGetTime(arrayList,10 , "arrayList");
        checkRemoveTime(linkedList,1 , "LinkedList");
        checkRemoveTime(arrayList,1 , "arrayList");


    }

    public static void checkGetTime(List<Integer> list,int index,String type){
        long startTime = System.nanoTime();
        list.get(index);
        long endTime = System.nanoTime();
        System.out.println("time taken to get type "+type + " " + (endTime-startTime));
    }

    public static void checkRemoveTime(List<Integer> list,int index,String type){
        long startTime = System.nanoTime();
        list.remove(index);
        long endTime = System.nanoTime();
        System.out.println("time taken to remove type "+type + " " + (endTime-startTime));
    }

}

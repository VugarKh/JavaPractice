package donjeta.task_part_03;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(9,1,2,13,8,7,55,3,4,31,5,6,10));

        System.out.println(sortArrayList(number));

    }

    public static ArrayList<Integer> sortArrayList(ArrayList<Integer> list){

        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size()-1; j > i ; j--) {
                if(list.get(i)>list.get(j)){
                  //  int temp =list.get(i);
                    // list.set(i,list.get(j));
                  //  list.set(j,temp);
                    list.set(i,list.get(i)*list.get(j));
                    list.set(j, list.get(i)/list.get(j));
                    list.set(i,list.get(i)/list.get(j));
                }
            }
        }
        return list;
    }
}

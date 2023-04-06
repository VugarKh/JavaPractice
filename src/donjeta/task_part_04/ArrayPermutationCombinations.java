package donjeta.task_part_04;

import java.util.*;

public class ArrayPermutationCombinations {

    public static  void printArray(int [] a){
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
    public static void swap (int [] a ,int i,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void printPermutation(int [] a,int cid){
        if(cid==a.length-1){
            printArray(a);
            return;
        }
        for (int i = cid; i <a.length; i++) {
            swap(a,i,cid );
            printPermutation(a,cid+1);
            swap(a,i, cid);
        }
    }
    public static void main(String[] args) {

        int [] a = {1,2,3};
        printPermutation(a,0);
    }
}

package donjeta.task_part_02;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        int [] arr = {1,0,2,0,3,0,4,0,5,0};
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[0]){
                   continue;
                }
               arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();

        int [] arr2 = {10,0,20,0,30,0,40,0,50,0};


        System.out.println(Arrays.toString(moveZero(arr2)));

    }

    public static  int [] moveZero (int [] arr){

        int[] newArr = new int[arr.length];
        int index = 0;

        for (int each : arr) {
            if(each!=0){
                newArr[index++]= each;
            }
        }
       return newArr;
    }


}

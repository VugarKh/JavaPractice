package practice;

import java.util.Arrays;

public class MoveZeros2 {
    public static void main(String[] args) {


        int [] arr = {1,0,2,0,3,0,4,0,5,0};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]==0){
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}

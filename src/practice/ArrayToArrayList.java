package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {

        int[] arr = {1, 39, 4, 95, 4, 3, 80, 95, 6, 3, 7, 50, 39};

        System.out.println(arraylist(arr));
    }

    public static ArrayList<Integer> arraylist(int [] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                list.add(arr[i]);
            }
        }
        return list;
    }
}

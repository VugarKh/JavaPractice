package donjeta.task_part_01;

import java.util.Arrays;

public class FindMaxArray {
    public static void main(String[] args) {

        int[] arr = {95, 56, -75, 3, 105, -24, 42, 9};
        int[] arr1 = {95, 56, -75, 3, 105, -24, 42, 9};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

         System.out.println(maxInArray(arr));

    }

    public static int maxInArray(int[] arr) {

        int maxNum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
}

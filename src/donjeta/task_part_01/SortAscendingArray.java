package donjeta.task_part_01;

import java.util.Arrays;

public class SortAscendingArray {

    public static void main(String[] args) {

        int[] arr = {4, 95, 149, 3, 80, -75, 6, -809, 7};
        int[] arr1 = {4, 95, 149, 3, 80, -75, 6, -809, 7};

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.toString(sortArrAscending(arr)));

    }
    public static int[] sortArrAscending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {   // -809,-75,3.4.6.7.80.95.149
            for (int j = i+1; j < arr.length; j++) { // 809,-75,3.4.6.7.80.95.149
                if (arr[i] < arr[j]) {
                    arr[i] = arr[i] + arr[j]; // i=i(4)+j(95)=99
                    arr[j] = arr[i] - arr[j]; // j = 99 =95 =4
                    arr[i] = arr[i] - arr[j]; //i =99-4 =95
                }
            }
        }
        return arr;
    }
}

package donjeta.task_part_02;

import java.sql.Array;
import java.util.Arrays;

public class ConcatTwoArrays {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(conTwoArr(a, b)));
    }

    public static int[] conTwoArr(int[] a, int[] b) {

        int[] arr = new int[a.length + b.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            arr[index] = a[i];
            index++;
        }
        for (int j = 0; j < b.length; j++) {
            arr[index] = b[j];
            index++;
        }
        return arr;
    }
}

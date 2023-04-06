package interview;

import java.sql.Array;
import java.util.Arrays;

public class Task_02 {
//2. Array reverse. Write a method that will take an array as an argument and reverse it.

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {6,7,8,9,10};

        System.out.println(Arrays.toString(arrayReverse(arr)));
        System.out.println();
        System.out.println(Arrays.toString(arrayReverse2(arr2)));


    }

    public static int[] arrayReverse(int[] array) {

        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[newArray.length - 1 - i] = array[i];
        }
        return newArray;
    }

    public static int[] arrayReverse2(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            array[i] = array[i] + array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i] - array[array.length - 1 - i];
            array[i] = array[i] - array[array.length - 1 - i];
        }


        return array;
    }
}

package practice;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {4, 95, 149, 3, 80, -75, 6, -809, 7};

        System.out.println(Arrays.toString(sortArray((arr))));

    }

    public static int[] sortArray(int[] array) {
        int [] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    array[i]= array[i]+array[j]; //i=(i)4+(j)95>>>(i)99
                    array[j] = array[i]- array[j]; //j=(i)99-j(95)>>>j(4)
                    array[i] = array[i]-array[j]; //i=(i)99-j(4)>>>i(95)
                    newArr[i]=array[i];
                }
            }
        }

        return newArr;
    }
}

/*

for swap to int we can:
      for ex: int a = 10 ; int b = 7;
      1 method>> a=a+b; b=a-b; a=a-b >>> it is mean a=10+7=17 , b=17-7=10 , a=17-10= 7  now a=7 and b=10
      2 method>> int temp = 0;  temp=a ;  a=b ; b=temp; it is mean temp=10; a=7 ; b=10 same result

 */
package donjeta.task_part_02;

import vesa.task_part_2.StringReverse;

public class SumOfDigits {
    /*
    2)String - sum of digits in a string
    Write a method that can return the sum of the digits in a string
     */

    public static void main(String[] args) {

        String str = "as145bd200lfd200&%100yi";

        int sum = 0;

        str=str.replaceAll("[\\D]+"," ");
        String [] strArr = str.trim().split(" ");

        for (int i = 0; i < strArr.length; i++) {
            sum+=Integer.parseInt(strArr[i]);
        }

        System.out.println(sum);

    }
}

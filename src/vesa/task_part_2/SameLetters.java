package vesa.task_part_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SameLetters {
    /*
    2) String - Same letters
    Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:
     */
    public static void main(String[] args) {

        System.out.println(SameLetters("abc","aba"));

    }
    public static boolean SameLetters(String word1,String word2){
        char [] ch1 = word1.toCharArray();
        char [] ch2 = word2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

       return Arrays.equals(ch1,ch2);

    }
}

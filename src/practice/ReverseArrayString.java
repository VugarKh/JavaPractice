package practice;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayString {
    public static String reverse(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }

        return result;
    }
    public static void main(String[] args) {

        String[] arrays = {"James", "Bond", "007"};

        System.out.println(Arrays.toString(reverseEachData(arrays)));
    }
    public static String[] reverseEachData(String[] array) {

        for (String each : array) {
            each=reverse(each);
        }
        return array;
    }
}

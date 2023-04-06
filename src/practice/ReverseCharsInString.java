package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseCharsInString {
    public static void main(String[] args) {

        String str = "test12code35java123lule55";
        String strLetter = str.replaceAll("[\\d]+", " ");
        String strNumber = str.replaceAll("[\\D]+", " ");

        String[] word = strLetter.trim().split(" ");
        String[] number = strNumber.trim().split(" ");
        String result = "";

        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();

        for (int i = 0; i < word.length; i++) {
            words.add(word[i]);
        }

        for (int i = 0; i < words.size(); i++) {
            words.set(i, reverse(words.get(i)));

        }

        for (int i = 0; i < number.length; i++) {
            numbers.add(number[i]);
        }
        for (int i = 0; i < words.size(); i++) {
            result+=words.get(i)+numbers.get(i);
        }

        System.out.println(result);
        System.out.println(words);
        System.out.println(numbers);

    }
    public static String reverse (String str ){

        String rever = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            rever+=str.charAt(i);
        }
     return rever;
    }
}

package practice;

import java.util.ArrayList;
import java.util.Collections;

public class SortString {
    public static void main(String[] args) {

        String input = "DC501GCCCA098911";

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {

            if (Character.isAlphabetic(input.charAt(i))) {
                list.addAll(digits);
                digits.clear();
                letters.add(input.charAt(i));
                Collections.sort(letters);
            } else if (Character.isDigit(input.charAt(i))) {
                list.addAll(letters);
                letters.clear();
                digits.add(input.charAt(i));
                Collections.sort(digits);
            }
        }
        list.addAll(digits);
        System.out.println(list);
    }
}


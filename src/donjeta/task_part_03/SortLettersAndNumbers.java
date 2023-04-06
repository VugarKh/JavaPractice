package donjeta.task_part_03;

import java.util.ArrayList;
import java.util.Collections;

public class SortLettersAndNumbers {
    public static void main(String[] args) {


    String str = "DC501GCCCA098911BA";

    ArrayList<Character> letters = new ArrayList<>();
    ArrayList<Character> digits = new ArrayList<>();

    ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

        if (Character.isAlphabetic(str.charAt(i))) {
            list.addAll(digits);  //0->0
            digits.clear();  //0->0
            letters.add(str.charAt(i));  //D->C
            Collections.sort(letters);  //D->CD
        } else if (Character.isDigit(str.charAt(i))) {
            list.addAll(letters); //
            letters.clear();  //
            digits.add(str.charAt(i));  //5
            Collections.sort(digits);  //5-> 05 -> 015
        }
    }
        list.addAll(digits);
        list.addAll(letters);
        System.out.println(list.toString().replace("[", "").replace("]","").replace(",", "").replace(" ", ""));
    }
}

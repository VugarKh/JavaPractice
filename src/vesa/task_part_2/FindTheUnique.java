package vesa.task_part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindTheUnique {
    /*
        4) String - Find the unique
    Write a return method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF") ==> "DEF";
     */
    public static void main(String[] args) {

        String word = "ABBCCCDDFFF";

        System.out.println(UniquChar(word));

    }
        public static String UniquChar (String word){

        String str = "";
        for (int i = 0; i < word.length(); i++) {
            int check = 0;
            for (int j = 0; j < word.length(); j++)
            {
                // checking if two characters are equal but not equals index
                if (word.charAt(i) == word.charAt(j) && i != j) {
                    check=1;
                    break;
                }
            }
            if (check == 0)
                str+=""+word.charAt(i);
        }
       return str;
    }
}

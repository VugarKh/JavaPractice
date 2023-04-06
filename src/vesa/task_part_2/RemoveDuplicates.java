package vesa.task_part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    /*
    3) String - Remove Duplicates
    Write a return method that can remove the duplicated values from String
    Ex:  removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {

        String word = "ABBCCCDDDDg";

        System.out.println(RemoveDuplicates(word));

    }

    public static String RemoveDuplicates( String word){

        String res = "";

        for (int i = 0; i < word.length(); i++){
            if(!res.contains(""+word.charAt(i))){
                res+=word.charAt(i);
            }
        }
        return res;
    }
}

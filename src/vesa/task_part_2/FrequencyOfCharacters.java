package vesa.task_part_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    /*
    1) String - Frequency of Characters
    Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void main(String[] args) {

        String word = "ABBCCCDDDDEEF";

        System.out.println(FrequencyOfCharacters(word));

    }

    public static String FrequencyOfCharacters (String word){

        String res = "";

        String [] str = word.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str));

        for (int i = 0; i < list.size(); i++) {
            int freq = Collections.frequency(list,list.get(i));
            if(res.contains(list.get(i))){
                continue;
            }
            res+= list.get(i)+ freq;
        }
        return res;
    }
}

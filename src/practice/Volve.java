package practice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Volve {
    public static void main(String[] args) {

        String name = "VugarKhalil";
        String result = "";

        char [] vowel = {'a','o','e','i','u'};
        char [] chars = name.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowel.length; j++) {
                if(chars[i]==vowel[j]){
                    result+=chars[i];
                }
            }
        }

        System.out.println(result);

    }
}

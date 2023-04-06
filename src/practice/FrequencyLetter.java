package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyLetter {
    public static void main(String[] args) {

        String str = "CarabasBarabas";
        String [] strToArray = str.split("");
        List<String> list = new ArrayList<>(Arrays.asList(strToArray));
        String result = "";
        int frequency = 0;

        for (int i = 0; i < list.size(); i++) {
            int freq = Collections.frequency(list,list.get(i));
            if(result.contains(list.get(i))){
                continue;
            }
            result+=list.get(i)+freq+" ";
        }

        System.out.println(result);

    }
}

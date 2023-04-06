package mikail.day_july11;

import java.util.HashMap;
import java.util.Map;

public class OccurrencesOfLettersWithMap {
    public static void main(String[] args) {

        occurrencesOfLettersWithMap("abracadabra");

    }
    public static void occurrencesOfLettersWithMap(String str){

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for (char each:str.toCharArray()) {
            if(map.get(each)==null){
                map.put(each, 1);
            }else {
                map.put(each, map.get(each)+1);
            }
        }
        map.forEach((key,value)->{System.out.println(str+" has "+value+" times "+key);
        });
    }
}

package donjeta.task_part_04;

import java.util.*;

public class SortMapByValues {
    public static void main(String[] args) {

        // create a map and store elements to it
        LinkedHashMap<String, String> capitals = new LinkedHashMap();
        capitals.put("Azerbaijan", "Baku");
        capitals.put("Turkey", "Ankara");
        capitals.put("United States", "Washington DC");
        capitals.put("England", "London");
        capitals.put("Ukraine", "Kiev");
        capitals.put("France", "Paris");
        capitals.put("Pakistan", "Islamabad");

        // call the sortMap() method to sort the map
        Map<String, String> result = sortMap(capitals);

        System.out.println(result);

//        for (Map.Entry entry : result.entrySet()) {
//            System.out.print("Key: " + entry.getKey());
//            System.out.println(" Value: " + entry.getValue());
//        }

    }

    public static LinkedHashMap sortMap(LinkedHashMap map) {
        List<Map.Entry<String, String>> list = new LinkedList<>(map.entrySet());

        // call the sort() method of Collections
        Collections.sort(list, (l1, l2) -> l1.getValue().compareTo(l2.getValue()));

        // create a new map
        LinkedHashMap<String, String> result = new LinkedHashMap();

        // get entry from list to the map
        for (Map.Entry<String, String> each : list) {
            result.put(each.getKey(), each.getValue());
        }

        return result;
    }
}

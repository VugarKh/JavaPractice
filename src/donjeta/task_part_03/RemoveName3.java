package donjeta.task_part_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveName3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Colin", "Tarik", "Ahmed", "Ahmed", "John", "Eric", "Ahmed", "Mike",
                "Woody"));

        System.out.println(removeName(list));

    }
    public static ArrayList<String> removeName(ArrayList names) {

        names.removeAll(Collections.singleton("Ahmed"));


        return names;
    }
}

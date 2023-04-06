package donjeta.task_part_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveName {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("James", "Tarik", "Ahmed", "Ahmed", "John", "Eric", "Ahmed", "Mike",
                "Ahmed"));

        System.out.println(removeName(list));

    }

    public static ArrayList<String> removeName(ArrayList<String> names) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            if (!names.get(i).equals("Ahmed"))
                list.add((names.get(i)));
        }

        return list;
    }



}

package donjeta.task_part_03;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveName2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Colin", "Tarik", "Ahmed", "Ahmed", "John", "Eric", "Ahmed", "Mike",
                "Ahmed"));

        System.out.println(removeName(list));

    }
    public static ArrayList<String> removeName(ArrayList names) {

        names.removeIf(each -> each.equals("Ahmed"));

        return names;
    }
}

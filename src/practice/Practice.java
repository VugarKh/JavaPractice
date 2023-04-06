package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {

        String[] strArr = {"aabc", "abcdb", "gggh", "klsrtabcabc",
                "78787*79789", "aaffdfddddddddddddd"};

        List<String> list = new ArrayList<>();

        for (String each : strArr) {
            if (each.contains("a") && each.contains("b") && each.contains("b")&& each.contains("b") && each.contains(
                    "c")) {
                list.add(each);
            }
        }

        System.out.println("list = " + list);

    }
}
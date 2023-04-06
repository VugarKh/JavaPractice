package donjeta.task_part_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveNumber2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 121, 3, 1, 414, 5, 159, 100, 1, 1200, 56, 1, 310, 400, 22, 1, 515, 45, 1, 87, 8, 1, 27,
                106));

       // System.out.println(removeNumber(list));
        System.out.println(removeNumber(list));

    }

    public static ArrayList<Integer> removeNumber(ArrayList<Integer> numbers) {

       // numbers.removeIf(each -> each >= 100);
        numbers.removeAll(Collections.singleton(1));

        return numbers;
    }
}

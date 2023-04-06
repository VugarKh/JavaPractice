package donjeta.task_part_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RemoveNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 121, 3, 414, 5, 600, 100, 200, 300, 400, 500, 45, 87, 8, 1, 27));

        System.out.println(removeNumber(list));

    }

    public static ArrayList<Integer> removeNumber(ArrayList<Integer> numbers) {

        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 100) {
                numberList.add(numbers.get(i));
            }
        }
        return numberList;
    }
}
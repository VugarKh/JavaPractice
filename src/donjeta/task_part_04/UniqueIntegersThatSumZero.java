package donjeta.task_part_04;

import java.util.*;

public class UniqueIntegersThatSumZero {
    public static void main(String[] args) {

        int number = 21;

        System.out.println(Arrays.toString(uniqueIntegersThatSumZero(number)));

        System.out.println();

        System.out.println(Arrays.toString(uniqueIntegersThatSumZero2(number)));



    }

    public static int[] uniqueIntegersThatSumZero(int num) {

        List<Integer> list = new ArrayList<>();

        if (num <= 100 && num > 0) {
            if (num % 2 == 0) {
                for (int i = 1; i <= num / 2; i++) {
                    list.add(num-i);
                    list.add(-num+i);
                }
            } else {
                list.add(0);
                for (int i = 1; i <= num / 2; i++) {
                    list.add(num-i);
                    list.add(-num+i);
                }
            }
        } else {
            System.out.println("Your number more than 100 or less that 0");
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }


    public static int[] uniqueIntegersThatSumZero2(int num) {

        List<Integer> list = new ArrayList<>();

        if (num <= 100 && num > 0) {
            if (num % 2 == 0) {
                for (int i = 1; i <= num / 2; i++) {
                    list.add(i);
                    list.add(-i);
                }
            } else {
                list.add(0);
                for (int i = 1; i <= num / 2; i++) {
                    list.add(i);
                    list.add(-i);
                }
            }
        } else {
            System.out.println("Your number more than 100 or less that 0");
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}

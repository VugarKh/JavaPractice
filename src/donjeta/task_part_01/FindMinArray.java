package donjeta.task_part_01;

public class FindMinArray {
    public static void main(String[] args) {

        int[] arr = {95, 56, -75, 3, 105, -24, 42, 9};

        System.out.println(minInArray(arr));

    }

    public static int minInArray(int[] arr) {

        int minNum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (minNum > arr[i]) {
                minNum = arr[i];
            }
        }
        return minNum;
    }
}

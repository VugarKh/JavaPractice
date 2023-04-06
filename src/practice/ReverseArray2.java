package practice;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] original = {45, 91, 14, 80, 97,-56,7};
        int[] array = {45, 91, 14, 80, 97,-56,7};
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(reverse(array)));
    }

    public static int[] reverse(int[] nums) {
        for (int i = 0; i < nums.length/2; i++){
            nums[i]=nums[i]*nums[nums.length-1-i];
            nums[nums.length-1-i]=nums[i]/nums[nums.length-1-i];
            nums[i]=nums[i]/nums[nums.length-1-i];
        }
        return nums;
    }
}

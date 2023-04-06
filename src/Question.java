import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Question {
    public static void main(String[] args) {


            String str = "DC501GCCCA098911";

            ArrayList<Character> letters = new ArrayList<>();
            ArrayList<Character> nums = new ArrayList<>();
            ArrayList<Character> combination = new ArrayList<>();

            for (int i = 0; i < str.length(); i++) {


                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    letters.add(str.charAt(i));
                    Collections.sort(letters);
                    combination.addAll(nums);
                    nums.clear();

                } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    nums.add(str.charAt(i));
                    Collections.sort(nums);
                    combination.addAll(letters);
                    letters.clear();

                }
            }

            combination.addAll(letters);
            combination.addAll(nums);
             System.out.println(str);
        System.out.println(combination);
            System.out.println(combination.toString().replace(", ","").replace("[","").replace("]",""));
    }
}

package interview;

public class Task_04 {
    //4. String palindrome. A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward.

    public static void main(String[] args) {

        String word = "racecar";

        System.out.println(palindrome(word));

    }
    public static boolean palindrome (String word){

        String reverse = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+=word.charAt(i);
        }
        if(reverse.equals(word)){
            return true;
        }

        return false;
    }
}

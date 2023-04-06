package interview;

public class Task_03 {
    //3. Reverse words. Write a method that will take a string as an argument. The method will reverse the position of words and return it.

    public static void main(String[] args) {

        String str = "My name is James Bond";

        System.out.println(reverseWholeString(str));

        System.out.println();

        System.out.println(reverseWholeString1(str));


    }
    public static String reverseWholeString (String word){
        String [] str = word.split(" ");
        String reverse = "";

        for (int i = 0; i < str.length; i++) {
            reverse=str[i]+" "+reverse;
        }
        return reverse.trim();
    }
    public static String reverseWholeString1 (String word){
        String [] str = word.split(" ");
        String reverse = "";

        for (int i = str.length-1; i >=0 ; i--) {
            reverse+=str[i]+" ";
        }
        return reverse.trim();
    }
}

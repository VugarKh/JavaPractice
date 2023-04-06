package interview;

public class Task_01 {
    //1. String reverse. Write a method that will take one string as an argument and will return the reverse version
    // of this string.

    public static void main(String[] args) {

        System.out.println(reverseMethod1("JavaIsFun"));

        System.out.println();

        System.out.println(reverseMethod2("My name is James"));


    }
    public static String reverseMethod1 (String str){

        String reverse = "";

        for (int i = 0; i < str.length(); i++) {
            reverse=str.charAt(i)+reverse;
        }

        return reverse;
    }

    public static String reverseMethod2 (String str){

        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }
}

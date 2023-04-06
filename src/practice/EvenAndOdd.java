package practice;

public class EvenAndOdd {
    /*
    "1. Numbers - odd & even
            Write a method which can identifies given number is even or odd
            EX:
            identify(5) -> ""Odd""
            identify(6) -> ""Even"""
     */
    public static void main(String[] args) {
        System.out.println(EvenNumber(131));
    }

    public static String EvenNumber(int num) {

        if (num % 2 == 0) {
            return num + " Even";
        }
        return num + " Odd";
    }

}

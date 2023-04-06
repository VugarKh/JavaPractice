package vesa.task_part_2;

public class StringReverse {
    /*
    5) String - Reverse
    Write a return method that can reverse String
    Ex: Reverse("ABCD"); ==> DCBA
     */
    public static void main(String[] args) {
        System.out.println(Reverse("Cydeo"));

        System.out.println(Reverse1("Java"));

    }

    public static String Reverse (String word){

        String reverse = "";

        for (int i = word.length()-1; i >= 0 ; i--) {
            reverse+=word.charAt(i);
        }
        return reverse;
    }

    public static String Reverse1(String word){

        String reverse = "";

        for (int i = 0; i < word.length(); i++) {
            reverse=word.charAt(i)+reverse;
        }
        return reverse;
    }
}

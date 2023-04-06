package mikail.day_june6;

public class SwapTwoStrings {
    public static void main(String[] args) {

        String a = "Batch 26";
        String b = "Group 13";

        swapString(a,b);
    }
     public static void swapString ( String word1, String word2){
        word1=word1+word2;
        word2=word1.substring(0,word1.length()-word2.length());
        word1=word1.substring(word2.length());

        System.out.println("Now String a is "+word1);
        System.out.println("Now String b is "+word2);
    }
}

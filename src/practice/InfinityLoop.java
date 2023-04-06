package practice;

public class InfinityLoop {

    public static void main(String[] args) {

        boolean abc = true;
        String str = "Java";

//        while (abc){
//            System.out.println("Infinity Loop");
//        }

        for (int i = 0; i < str.length(); i--) {
            System.out.println("Infinity loop");
        }

    }
}

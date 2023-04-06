public class CodingBat {
    public static void main(String[] args) {

        int a = 9;
        int b = 4;
        int c = 4;

        System.out.println(noTeenSum(a, b, c));

    }
    public static int round10 (int n){
        if(n%10>=5 && n%10<9){
            return n-(n%10)+10;
        }
        return n-(n%10);
    }

    public static int noTeenSum(int a, int b, int c) {
        return round10(a)+round10(b)+round10(c);
    }
}



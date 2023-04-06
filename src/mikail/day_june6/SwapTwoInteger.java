package mikail.day_june6;

public class SwapTwoInteger {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int x = 4;
        int y = 11;

        swap(a, b);

        swap2(x, y);
    }
    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Now a is equals " + a + " and b is equals " + b);
    }
    public static void swap2(int x, int y){
        x = x * y;
        y = x / y;
        x = x / y;

        System.out.println("Now x is equals " + x + " and y is equals " + y);
    }
}

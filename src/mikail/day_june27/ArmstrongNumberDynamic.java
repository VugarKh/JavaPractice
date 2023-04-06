package mikail.day_june27;

public class ArmstrongNumberDynamic {
    public static void main(String[] args) {

        int num = 534494836;

        System.out.println(armstrongNumber(num));

    }

    public static boolean armstrongNumber(int number) {

        int temp = number;
        int lastDigit = 0;
        int armstrong = 0;
        String size = String.valueOf(number);

        while (number > 0) {
            lastDigit = number % 10;
            armstrong += Math.pow(lastDigit, size.length());
            number = number / 10;
        }
        if (temp == armstrong) {
            return true;
        }
        return false;
    }
}

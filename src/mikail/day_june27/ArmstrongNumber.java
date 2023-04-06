package mikail.day_june27;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        System.out.println(armstrongNumber(num));
    }

    public static boolean armstrongNumber(int number){

        int temp = number;
        int lastDigit = 0;
        int armstrong =0;

        while (number>0){
            lastDigit=number%10;
            armstrong+=lastDigit*lastDigit*lastDigit;
            number=number/10;
        }
        if(temp==armstrong){
            return true;
        }
        return false;
    }
}

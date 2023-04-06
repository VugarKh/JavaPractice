package practice;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int num1 = 11;
        int num2 = 2;
        System.out.println(divideTwo(num1,num2));

    }

    public static int divideTwo(int num1, int num2) {
        int count = 0; //10-2-2-2-2-2=0 10-2 8-2 6-2 4-2 2-2=0 1

        while (num1 > 0) {
            num1=num1-num2; //10=10-2=8= num1 8=8-2;
            count++;
        }
        return count;
    }
}

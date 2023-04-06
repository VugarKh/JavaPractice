package practice;

public class Fibonacci {
    public static void main(String[] args) {

        int number = 10;

        fibonacci(number);
        System.out.println();
        fibonacci2(10);

    }

    public static void fibonacci(int num) {

        int firstNum = 0;
        int secondNum = 1;

        System.out.print(firstNum + " " + secondNum);


        for (int i = 2; i < num; ++i) {

            int next = firstNum + secondNum;
            System.out.print(" "+next);
            firstNum= secondNum;
            secondNum=next;
        }

    }

    public static void fibonacci2(int num){
        int first = 0;
        int second = 1;

        for (int i = 0; i < num ; i++) {
            System.out.print(first+",");
            int next = first+second;
            first=second;
            second=next;
        }

    }
}

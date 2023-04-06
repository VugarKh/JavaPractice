package practice;

public class AmericanFlag {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            for (int j = 0; j < 5; j++) {
                System.out.print(" - ");
            }

            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" - ");
            }
            System.out.println();
        }

    }
}

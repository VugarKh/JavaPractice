package donjeta.task_part_02;

public class SumOfDigit_2 {
    public static void main(String[] args) {


        String str = "as145bd200lfd200";

        String tempNum = "0";

        int sumNum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                tempNum += str.charAt(i);
            }else {
                sumNum+=Integer.parseInt(tempNum);
                tempNum="0";
            }
        }
        System.out.println(sumNum+Integer.parseInt(tempNum));
    }
}
package donjeta.task_part_02;

public class Password {
    public static void main(String[] args) {

        String password = "JamesBond123!";
        System.out.println(checkPassword(password));
    }
    public static boolean checkPassword(String str){

        int digit = 0;
        int upperCase =0;
        int lowerCase =0;
        int other =0;

        if(str.length()>=6) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    digit++;
                } else if (Character.isUpperCase(str.charAt(i))) {
                    upperCase++;
                } else if (Character.isLowerCase(str.charAt(i))) {
                    lowerCase++;
                } else {
                    other++;
                }
            }
            if (digit > 0 && upperCase > 0 && lowerCase > 0 && other > 0 && !str.contains(" ")) {
                return true;
            }
        }
        return false;
    }
}

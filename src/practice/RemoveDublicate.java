package practice;

public class RemoveDublicate {
    public static void main(String[] args) {

        String str = "KamalaKhalil";
        String newStr = "";

        for (int i = 0; i<str.length();i++){
            for (int j = i; j <str.length() ; j++) {
                if(!newStr.contains(""+str.charAt(i))){
                    newStr+=str.charAt(i);
                }
            }

        }
        System.out.println(newStr);
    }
}

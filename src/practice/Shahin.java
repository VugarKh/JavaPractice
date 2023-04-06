package practice;

public class Shahin {
    public static void main(String[] args) {

        String str = "AABBDDEF";
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            if(!res.contains(str.charAt(i)+"")){
                res+=str.charAt(i);
            }
        }

        System.out.println(res);

    }
}

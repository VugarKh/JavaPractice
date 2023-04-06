package practice;

public class dup {
    public static void main(String[] args) {
        String name="findduplicatecharacter";
        String str="";

        for (int i = 0; i < name.length(); i++) {
            int count=0;
            if (!str.contains(name.charAt(i)+"")){
                for (int j = 0; j < name.length(); j++) {
                    if (name.charAt(i)==name.charAt(j)){
                        count+=1;
                    }
                }
            }
            if (count>=2){
                str+=name.charAt(i)+""+count;
            }

        }
        System.out.println(str);

    }
}

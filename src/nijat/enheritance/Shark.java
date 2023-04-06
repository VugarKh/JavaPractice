package nijat.enheritance;

public class Shark extends Fish {

    public Shark(String name,String size,char gender,int age){
        super(name,size,gender,age);
    }

    public void attack(){
        System.out.println(name + " is attacking people");
    }
}

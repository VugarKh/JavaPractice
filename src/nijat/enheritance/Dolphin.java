package nijat.enheritance;

public class Dolphin extends Fish {

    public Dolphin(String name,String size,char gender,int age) {
        super(name, size, gender, age);
    }

    public void friendly(){
        System.out.println(name + " is not attacking people");
    }
}

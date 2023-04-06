package nijat.enheritance;

public class Animal {

    String name;
    String size;
    char gender;
    int age;



    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}

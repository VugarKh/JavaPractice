package nijat.constructor;

public class Person {
    String name;
    int age;
    char gender;
    boolean areYouWorking;
    static int SNN =0;

   static{
       System.out.println("My SSN " + SNN);
   }


//    public Person(){
//        System.out.println("Hi from constructor");
//    }

    public Person (String name){
        this.name = name;
        System.out.println("Hi from first constructor");
    }

    public Person (String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("Hi from second constructor");
    }

    public Person (String name,int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("Hi from third constructor");
    }
    public Person(String name,int age, char gender,boolean areYouWorking){
        this(name,age,gender);
        //this.gender = gender;
        this.areYouWorking = areYouWorking;
        System.out.println("Hi from fourth constructor");
    }

    @Override
    public String toString() {
        return "Person: " + name + " age: " + age + " gender: " + gender + ". Are you working: " + areYouWorking;
    }
}

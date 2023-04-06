package oop;

public class Job extends Person {
    public static void main(String[] args) {

        Person obj1 = new Person();
       obj1.setName("James");
       obj1.setLastName("Bond");
       //obj1.setAge(35);
       obj1.setGender('M');

        Person obj2 = new Person();
        obj2.setName("Jam");
        obj2.setLastName("Bo");
        //obj1.setAge(35);
        obj2.setGender('M');

        Person obj3 = new Student();
        obj3.setName("Anna");

        Student obj4 =  (Student) new Job();
        obj4.setName("OBJECT 4");






        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);

    }
}

package nijat.encapsulation;

public class RunPerson {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("");
        person1.setAge(25);
        person1.setGender('M');
        person1.speak();
        System.out.println(person1);



    }
}

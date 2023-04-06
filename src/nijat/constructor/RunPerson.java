package nijat.constructor;

public class RunPerson {
    public static void main(String[] args) {

        Person obj1 = new Person("James");
        System.out.println(obj1);
        System.out.println();
        Person.SNN= 12;

        Person obj2 = new Person("Mary",25);
        System.out.println(obj2);
        System.out.println();

        Person obj3 = new Person("Robert",30,'M');
        System.out.println(obj3);
        System.out.println();

        Person obj4 = new Person("Patricia",35,'F',true);
        System.out.println(obj4);
        System.out.println();

//        Person obj5 = new Person();
//        System.out.println(obj5);




    }
}

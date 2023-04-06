package nijat.enheritance;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "Lucy";
        dog.size = "Medium";
        dog.gender = 'F';
        dog.age = 4;

        dog.sleep();
        dog.eat();
        dog.bark(); //own metod
        System.out.println(dog);

        Cat cat = new Cat();
        cat.name = "Jermy";
        cat.size = "Small";
        cat.gender = 'M';
        cat.age = 5;
        cat.scratch(); // own method

        System.out.println(cat);

        Shark shark = new Shark("Akula","Extra Large",'M',8); //constructor from Fish
        shark.sleep(); //from Animal
        shark.eat(); //from Animal
        shark.swim(); // from Fish
        shark.attack();// own method
        System.out.println(shark);

        Dolphin dolphin = new Dolphin("Dolly","Large",'F',8); //constructor from Fish
        dolphin.sleep(); //from Animal
        dolphin.eat(); //from Animal
        dolphin.swim(); // from Fish
        //dolphin.attack();// because this sharks own method
        dolphin.friendly();
        System.out.println(dolphin);



    }
}

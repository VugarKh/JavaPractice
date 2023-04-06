package oop.abstraction;

public class Duck implements Swimmable {

    public void swim() {
        System.out.println("Duck, swim!");
    }

    public static void main(String[] args) {

        Duck duck = new Duck();
        duck.swim();
    }
}
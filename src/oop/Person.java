package oop;

public class Person {
    private String name;
    private String lastName;
    final static int age =25;
    private char gender;

    static {
        System.out.println("Static");
    }

   {
       System.out.println("Ada diqqet ele");
    }

    {
        System.out.println("Qabagda luk var");
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.startsWith("J")){
            this.name = name;
        }

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender=='M' || gender=='F') {
            this.gender = gender;
        }else{
            System.out.println("Yon can not use other gender");
        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

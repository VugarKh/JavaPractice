package nijat.encapsulation;

public class Person {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name=="" && name.isBlank()){
            System.out.println("Name can't be empty");
            System.exit(0);
        }else {
            this.name = name;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<1){
            System.out.println("Age can't be a negative number or zero");
        }else {
            this.age = age;
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender=='M' || gender=='m' || gender=='F' || gender=='m'){
        }else{
            System.out.println("You can't change your gender");
        }
        this.gender = gender;
    }

    void speak(){ //You can use default,public,protected not private
        System.out.println("My name is "+ name);
    }

    @Override
    public String toString() {
        return "Person: " +
                 name +
                ", age " + age +
                ", gender " + gender;
   }
}

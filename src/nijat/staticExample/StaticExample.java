package nijat.staticExample;

public class StaticExample {
    protected static class Vuqar{

    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Vuqar";
        student.number = 12;
        student.getNumber(1985);
        Student student1 = new Student();
        student1.name = "Nijat";
        student1.number = 15;
        student1.getNumber(1988);
        System.out.println(student.name);
        System.out.println(student1.name);

        Student.getNumber(19999);


        System.out.println(student.number);
        System.out.println(student1.number);
    }
}

package OOP_Basic.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Anamul";
        s1.age =  21;
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}

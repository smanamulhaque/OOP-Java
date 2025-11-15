package OOP_Basic.Student;

public class Student {
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    /*
    normal constructor cannot have any value
    Student(String name, int age){
        System.out.println("Constructor called");
     */
    /*
    parameter constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
     */
    // Default
    Student(){

    }
// Copy Constructor
    Student(Student s2){
        this.name= s2.name;
        this.age = s2.age;
    }
}

package OOP_Polymorphism;
//Compile time polymorphism
//if Same name have many function its called function Overloading
public class Student {
    String name;
    int age;

public void printinfo(String name){
    System.out.println(name);
}
public void printinfo(int age){
    System.out.println(age);
}
public void printinfo(String name,int age){
    System.out.println(name+"\n"+age);
}
}

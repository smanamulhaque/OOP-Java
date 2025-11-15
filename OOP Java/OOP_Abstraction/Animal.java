package OOP_Abstraction;
abstract class Animal {
   abstract void walk();
   Animal(){
      System.out.println("you are creating a new Animal");
   }
   public void eat() {
      System.out.println("Animal eats");
   }
}

package OOP_Basic;

public class Main {
    public static void main(String[] args) {
        Pen  pen1 = new Pen();
         pen1.color ="blue";
         pen1.type ="gel";

         Pen pen2  = new Pen();
         pen2.color="Black";
         pen2.type="Ballpoint";

         pen1.printColor();
         pen2.printColor();

    }
}

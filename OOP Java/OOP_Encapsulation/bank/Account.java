package OOP_Encapsulation.bank;
//Access Modifier
// 1. Public -> public String name; (Everyone can access this modifier)
// 2. Default -> String name;   (This Access modifier Current  package any item can access this Modifier)
// 3. Protective -> Protective String name; ( This Access modifier Current package and another package subclass can do access )
// 4. Privet ->  private String password;   (only current Class can access , package ar any other class or sub Cass cannot access)

public class Account {
    public String name;
    protected String email;
   private String password;
   // setters
   public void setPassword(String pass){
       this.password=pass;
   }
    // getters
    public String getPassword(){
        return this.password;
    }


}

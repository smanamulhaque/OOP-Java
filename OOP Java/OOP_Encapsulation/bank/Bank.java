package OOP_Encapsulation.bank;

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Anamul Haque";
        account1.email = "hoquesmanamul5@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}

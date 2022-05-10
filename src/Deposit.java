public class Deposit {
public static void main(String[] args) {
    
    // Instance
        BankAccount bankAccount = new BankAccount(500, "Joseph");
        bankAccount.deposit(100);
        System.out.println(bankAccount);

        var Larry = new BankAccount(5000, "Larry");
        Larry.withdrawal(100);
        System.out.println(Larry);

        var Mary =new BankAccount(300, "Mary");
        Mary.deposit(100);
        System.out.println(Mary);
    }
}

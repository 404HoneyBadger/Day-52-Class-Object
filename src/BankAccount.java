public class BankAccount {

    public int accountBalance;
    public String name;

    public BankAccount(int accountBalance1, String name1) {
       
        this.accountBalance = accountBalance1;

        this.name = name1;
    }

    public void deposit(int cashDeposit) {
        this.accountBalance += cashDeposit;
    }

    public void withdrawal(int cashWithd) {
        this.accountBalance -= cashWithd;
    }

    @Override
    public String toString(){
        return name + "'s account balance: " + accountBalance;
    }
}

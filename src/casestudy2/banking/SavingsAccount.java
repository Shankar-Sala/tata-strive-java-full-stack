package casestudy2.banking;

public class SavingsAccount extends BankAccount {

    public static final double MIN_BALANCE = 1000;


    public SavingsAccount(int accountNumber,
                          String holderName,
                          double balance) {

        super(accountNumber, holderName, balance);
    }

    @Override
    public void deposit(double amount) {

        balance += amount;
        addTransaction("Deposited : " + amount);
    }

    @Override
    public void withdraw(double amount) throws Exception {

        if (balance - amount < MIN_BALANCE) {
            throw new Exception(
                    "Withdrawal exceeds available balance!");
        }

        balance -= amount;
        addTransaction("Withdrawn : " + amount);
    }

    @Override
    public void accountType() {
        System.out.println("Account Type : Savings Account");
    }
}
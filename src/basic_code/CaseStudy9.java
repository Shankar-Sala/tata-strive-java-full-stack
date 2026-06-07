package basic_code;
/*
* A bank wats to develop a smart Banking System.
*
* Requirements:
*
* Every bank account should support deposit and withdrawal--ok
* Account details should be hidden using abstraction-----ok
* Banking rules should be defined using interface---ok
* withdrawal amount should not exceed balance
* Exception handling should manage invalid transactions.
* Display account details and transaction status.
*
*
* */

interface BankRules {

    void deposit(double amount);

    void withdraw(double amount);

}

abstract class Account {

    protected String accountHolder;
    protected double balance;

    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    abstract void accontDetails();

}

class SavingAccount extends Account implements BankRules {
    public SavingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    public void accontDetails() {
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Balance: " + this.balance);
    }

    public void deposit(double amount) {
        try {
            if (amount <= 0) {
                throw new ArithmeticException("Deposit Amount must be positive.");
            }
            this.balance += amount;
            System.out.println("Deposited : " + amount);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Deposit Transaction Completed");

        }
    }

    public void withdraw(double amount) {

        try {
            if (amount > balance) {
                throw new ArithmeticException("Insufficient Balance.");
            }

            if (amount <= 0) {
                throw new ArithmeticException("Invalid Withdraw Amount.");
            }
            this.balance -= amount;
            System.out.println("Balance : " + amount);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Withdraw Transaction Completed");
        }

    }
}


public class CaseStudy9 {
    public static void main(String[] args) {
        System.out.println("====Smart Banking System====");
        SavingAccount s1 = new SavingAccount("Shankar Sala", 50000);
        s1.accontDetails();
        s1.deposit(5000);
        s1.withdraw(25000);
        s1.withdraw(5000);
        s1.accontDetails();
        System.out.println("====Thank you====");

    }
}
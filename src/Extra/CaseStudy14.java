package Extra;

/*
Problem Statement
Tata STRIVE Bank wants to create a digital banking application.
Requirements:
1.	Customer can create an account.
2.	Maintain account number, holder name, and balance.
3.	Create hierarchy:
BankAccount
      ↓
SavingsAccount
      ↓
PremiumSavingsAccount
4.	Use multilevel inheritance.
5.	Use super() to initialize parent data.
6.	Use abstraction for account operations.
7.	Use interface for transaction rules.
8.	Allow deposit and withdrawal.
9.	Store last 5 transactions in an array.
10.	Throw exception if withdrawal amount exceeds balance.
11.	Use upcasting:
BankAccount acc =
      new PremiumSavingsAccount();
12.	Use final variable for minimum balance.
 */
interface TransactionRule {
    void deposit(double amount);
    void withdraw(double amount) throws Exception;
}

abstract class BankAccount implements TransactionRule {

    protected int accountNumber;
    protected String holderName;
    protected double balance;

    final double min_balance = 1000;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    abstract void displayAccount();
    abstract void showTransactions();
}

class SavingsAccount extends BankAccount {

    SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient Balance!");
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    @Override
    void displayAccount() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : " + balance);
    }

    @Override
    void showTransactions() {
    }
}

class PremiumSavingsAccount extends SavingsAccount {

    String[] transactions = new String[5];
    int count = 0;

    PremiumSavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    void addTransaction(String transaction) {
        if (count < 5) {
            transactions[count] = transaction;
            count++;
        }
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        addTransaction("Deposit : " + amount);
    }

    @Override
    public void withdraw(double amount) throws Exception {

        if (balance - amount < min_balance) {
            throw new Exception("Minimum Balance of 1000 must be maintained!");
        }

        super.withdraw(amount);
        addTransaction("Withdraw : " + amount);
    }

    @Override
    void showTransactions() {
        System.out.println("\nLast Transactions:");

        for (int i = 0; i < count; i++) {
            System.out.println(transactions[i]);
        }
    }
}

public class CaseStudy14 {

    public static void main(String[] args) {

        try {

            BankAccount acc = new PremiumSavingsAccount(101, "Shabina Khan", 10000);

            acc.deposit(5000);
            acc.withdraw(3000);

            acc.displayAccount();
            acc.showTransactions();

        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }

        System.out.println("\nProgram Ended");
    }
}
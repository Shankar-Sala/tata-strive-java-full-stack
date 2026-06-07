package June;
import java.util.Scanner;


/*
Smart ATM Banking System
Problem Statement

A bank wants to develop a Smart ATM Banking System for its customers.

The system should:

Store account holder details.
Allow customers to deposit money.
Allow customers to withdraw money.
Display current account balance.
Prevent withdrawal if the balance is insufficient.
Generate appropriate error messages for invalid transactions.
Use abstraction to define common banking operations.
Use interfaces to implement ATM services.
Use inheritance for different account types (Savings Account, Current Account).
Maintain a transaction counter using static variables.
Use final variables for bank-related constants.
Handle exceptions for invalid amounts and insufficient balance.

Class & Object
Constructor
this Keyword
Inheritance
Method Overriding
Abstraction
Interface
static
final
Exception Handling
Arrays (Transaction History)
 */


interface ATMServices {
    void deposit(double amount);
    void withdraw(double amount);
    void displayBalance();
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

abstract class Account implements ATMServices {

    protected String accountHolder;
    protected int accountNumber;
    protected double balance;

    static int transactionCount = 0;

    final String BANK_NAME = "ABC Bank";

    String[] history = new String[20];

    int index = 0;

    public Account(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void accountDetails();

    public void addTransaction(String transaction) {
        if (index < history.length) {
            history[index++] = transaction;
        }
    }

    public void showHistory() {
        System.out.println("\nTransaction History");

        for (int i = 0; i < index; i++) {
            System.out.println(history[i]);
        }
    }

    @Override
    public void deposit(double amount) {

        try {

            if (amount <= 0) {
                throw new IllegalArgumentException(
                        "Deposit amount must be greater than zero.");
            }

            balance += amount;
            transactionCount++;

            addTransaction("Deposited ₹" + amount);

            System.out.println("₹" + amount + " deposited successfully.");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void withdraw(double amount) {

        try {

            if (amount <= 0) {
                throw new IllegalArgumentException(
                        "Withdrawal amount must be greater than zero.");
            }

            if (amount > balance) {
                throw new InsufficientBalanceException(
                        "Insufficient Balance!");
            }

            balance -= amount;
            transactionCount++;

            addTransaction("Withdrawn ₹" + amount);

            System.out.println("₹" + amount + " withdrawn successfully.");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Current Balance : ₹" + balance);
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(String accountHolder,
                          int accountNumber,
                          double balance) {

        super(accountHolder, accountNumber, balance);
    }

    @Override
    public void accountDetails() {
        System.out.println("\n----- Savings Account -----");
        System.out.println("Bank Name : " + BANK_NAME);
        System.out.println("Holder Name : " + accountHolder);
        System.out.println("Account No : " + accountNumber);
        System.out.println("Balance : ₹" + balance);
    }
}

class CurrentAccount extends Account {

    public CurrentAccount(String accountHolder,int accountNumber,double balance) {

        super(accountHolder, accountNumber, balance);
    }

    @Override
    public void accountDetails() {
        System.out.println("\n----- Current Account -----");
        System.out.println("Bank Name : " + BANK_NAME);
        System.out.println("Holder Name : " + accountHolder);
        System.out.println("Account No : " + accountNumber);
        System.out.println("Balance : ₹" + balance);
    }
}


public class CaseStudy1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingsAccount acc =
                new SavingsAccount("Shankar Sala",
                        10101,
                        10000);

        acc.accountDetails();

        acc.deposit(5000);

        acc.withdraw(3000);

        acc.withdraw(20000);

        acc.deposit(-100);

        acc.displayBalance();

        acc.showHistory();

        System.out.println("\nTotal Transactions : "
                + Account.transactionCount);

        sc.close();
    }
}
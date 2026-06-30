package Extra;/*
Problem Statement

A bank wants to develop a Smart ATM Banking System for its customers.

The system should:

Store account holder details.--ok
Allow customers to deposit money.--ok
Allow customers to withdraw money.--ok
Display current account balance.--ok
Prevent withdrawal if the balance is insufficient.--ok
Generate appropriate error messages for invalid transactions.--ok
Use abstraction to define common banking operations.--ok
Use interfaces to implement ATM services.--ok
Use inheritance for different account types (Savings Account, Current Account).--ok
Maintain a transaction counter using static variables.--ok
Use final variables for bank-related constants.--ok
Handle exceptions for invalid amounts and insufficient balance.--ok
 */
import java.util.Scanner;
interface ATMServices{
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}
abstract class Banking{
    String accountHolder;
    int accountNum;
    double balance;
    static int transactionCount = 0;
    static final String BANK_NAME = "Tata Bank";
    Banking(String accountHolder,int accountNum, double balance){
        this.accountHolder=accountHolder;
        this.accountNum = accountNum;
        this.balance=balance;
    }
    abstract void withdraw(double amount);
    abstract void deposit(double amount);
    void displayBalance(){
        System.out.println("Total Balance: "+balance);
    }
    static void displayTransactionCount() {
        System.out.println("Total Transactions: " + transactionCount);
    }
}
class SavingAccount2 extends Banking implements ATMServices{
    double interestRate;
    SavingAccount2(String accountHolder, int accountNum, double balance,double interestRate) {
        super(accountHolder, accountNum, balance);
        this.interestRate=interestRate;
    }

    public void withdraw(double amount){
        try {
            if (amount>balance){
                throw new ArithmeticException("Insufficient Balance");
            }
            if (amount<=0){
                throw new ArithmeticException("Invalid Withdrawal Amount");
            }
            balance=balance-amount;
            transactionCount++;
            System.out.println(amount+"Withdraw Successfully");
        }
        catch (ArithmeticException e1){
            System.out.println(e1.getMessage());
        }
        finally {
            System.out.println("Withdrawal Transaction Complete");
        }
    }
    public void deposit(double amount){
        try {
            if (amount<=0){
                throw new ArithmeticException("Deposit Amount must be Positive");
            }
            balance=balance+amount;
            transactionCount++;
            System.out.println(amount+"Deposit Successfully");
        }
        catch (ArithmeticException ee1){
            System.out.println(ee1.getMessage());
        }
        finally {
            System.out.println("Deposit Transaction Complete");
        }
    }
    public void checkBalance(){
        displayBalance();
    }
}
class CurrentAccount2 extends Banking implements ATMServices{
    double overdraftLimit;
    CurrentAccount2(String accountHolder, int accountNum, double balance, double overdraftLimit) {
        super(accountHolder, accountNum, balance);
        this.overdraftLimit=overdraftLimit;
    }

    public void withdraw(double amount){
        try {
            if (amount>balance){
                throw new ArithmeticException("Insufficient Balance");
            }
            if (amount<=0){
                throw new ArithmeticException("Invalid Withdrawal Amount");
            }
            balance=balance-amount;
            transactionCount++;
            System.out.println(amount+"Withdrawal Successfully");
        }
        catch (ArithmeticException e1){
            System.out.println(e1.getMessage());
        }
        finally {
            System.out.println("Withdrawal Transaction Complete");
        }
    }
    public void deposit(double amount){
        try {
            if (amount<=0){
                throw new ArithmeticException("Deposit Amount must be Positive");
            }
            balance=balance+amount;
            transactionCount++;
            System.out.println(amount+"Deposit Successfully");
        }
        catch (ArithmeticException ee1){
            System.out.println(ee1.getMessage());
        }
        finally {
            System.out.println("Deposit Transaction Complete");
        }
    }
    public void checkBalance(){
        displayBalance();
    }
}

public class CaseStudy11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingAccount2 s1 =
                new SavingAccount2("Shabina",101,10000,4.5);

        int choice;

        do{
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction Count");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = sc.nextDouble();
                    s1.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawAmount = sc.nextDouble();
                    s1.withdraw(withdrawAmount);
                    break;

                case 3:
                    s1.checkBalance();
                    break;

                case 4:
                    Banking.displayTransactionCount();
                    break;

                case 5:
                    System.out.println("Thank You For Using ATM");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        }while(choice != 5);
    }
}

package Extra;

/*
A bank wants to develop a Smart Banking System.
Requirements:
Every bank account should support deposit and withdrawal.--ok
Account details should be hidden using abstraction.--ok
Banking rules should be defined using interface.--ok
Withdrawal amount should not exceed balance.--ok
Exception handling should manage invalid transactions.--ok
Display account details and transaction status.
 */
interface BankingRules{
    void deposit(double amount);
    void withdraw(double amount);
}
abstract class Account{
    String accountHolder;
    double balance;
    public Account(String accountHolder,double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    abstract void accountDetails();
}
class SavingAccount1 extends Account implements BankingRules{
    public SavingAccount1(String accountHolder,double balance){
        super(accountHolder, balance);
    }
    void accountDetails(){
        System.out.println("Account Holder:"+accountHolder);
        System.out.println("Balance: "+balance);
    }
    public  void deposit(double amount){
        try {
            if (amount<=0){
                throw new ArithmeticException("Deposit Amount must be Positive");
            }
            balance=balance+amount;
            System.out.println(amount+"Deposit Successfully");
        }
        catch (ArithmeticException ee1){
            System.out.println(ee1.getMessage());
        }
        finally {
            System.out.println("Deposit Transaction Complete");
        }
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
            System.out.println(amount+"Deposit Successfully");
        }
        catch (ArithmeticException e1){
            System.out.println(e1.getMessage());
        }
        finally {
            System.out.println("Withdrawal Transaction Complete");
        }
    }
}

public class CaseStudy10 {
    public static void main(String[] args){
        System.out.println("===== SMART BANKING SYSTEM =====");
        SavingAccount1 b1 = new SavingAccount1("Sumit", 20000);
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        b1.accountDetails();
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        b1.deposit(10000);
        b1.withdraw(5000);
        b1.withdraw(110000);
        b1.accountDetails();

        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("===== THANK YOU =====");

    }
}

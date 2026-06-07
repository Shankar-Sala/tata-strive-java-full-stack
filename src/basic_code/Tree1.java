package basic_code;

/*
 *
 *                 Bank
 *                 |
 *    --------------------------------------------
 *    |                      |                   |
 * SavingsAccount       CurrentAccount       LoanAccount
 *
 * ---------two different class---sam emethod name-----------same list of parameter------------method overriding
 */

//parent class
class Bank {

    static int totalCustomers = 2000;

    final String country = "India";
    // it is run before main method i
    static {
        System.out.println("--------------------------");
        System.out.println("Bank System Started");
        System.out.println("--------------------------");


    }

    Bank() {
        totalCustomers++;
        System.out.println("Bank Constructor3");

    }

    void bankRules() {
        System.out.println("Follow Banking Rules");

    }

    void displayBank() {
        System.out.println("Country : " + country);
        System.out.println("Total Customers : " + totalCustomers);
    }

}

//child class
class SavingsAccount extends Bank {
    int balance = 500;

    SavingsAccount() {
        balance++;
        System.out.println("Savings Constructor3");

    }

    void calculateInterest() {
        int a = 10;
        //       11 +  11   11  +  11
        int b = ++a + a++ + --a + a--;
        System.out.println("Balance : " + balance);
        System.out.println("Value of b : " + b);//44
        System.out.println("Final Value of a : " + a);//10

    }
}

class CurrentAccount extends Bank {
    int overdraft = 2000;

    CurrentAccount() {
        overdraft++;
        System.out.println("Current Constructor3");

    }

    void accountType(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Business Account");
                break;
            case 2:
                System.out.println("Premium Account");
                break;
            default:
                System.out.println("Normal Account");
        }
    }

    void checkLimit() {
        if (overdraft >= 2000) {
            System.out.println("High Overdraft");

        } else {
            System.out.println("Low Overdraft");

        }
    }

}

class LoanAccount extends Bank {
    int loanAmount = 100000;

    LoanAccount() {

        loanAmount++;

        System.out.println("Loan Constructor3");
    }

    void loanStatus() {
        if (loanAmount > 100000) {
            System.out.println("Loan Approved");

        } else {
            System.out.println("Loan Pending");

        }
    }

    void bankRules() {

        System.out.println("Loan Department Rules");
    }
}

public class Tree1 {
    public static void main(String args[]) {
        SavingsAccount s1 = new SavingsAccount();
        s1.bankRules();
        s1.displayBank();
        s1.calculateInterest();
        System.out.println("--------------------------------");
        CurrentAccount c1=new CurrentAccount ();
        c1.bankRules();
        c1.displayBank();
        c1.accountType(2);
        c1.checkLimit();
        System.out.println("--------------------------------");
        LoanAccount l1=new LoanAccount ();
        l1.bankRules();
        l1.displayBank();
        l1.loanStatus();
        System.out.println("--------------------------------");




    }
}

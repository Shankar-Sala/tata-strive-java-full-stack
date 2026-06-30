package Extra;

class Bank {
    static int totalCustomers = 2000;
    final String country = "India";

    // It is run before main method
    static {
        System.out.println("Bank System Started");
        System.out.println("------------------------------------\n");
    }

    Bank() {
        totalCustomers++;
        System.out.println("Bank Constructor");
    }

    void bankRules() {
        System.out.println("Follow Banking Rules");
    }

    void displayBank() {
        System.out.println("Country : " + country);
        System.out.println("Total Customers : " + totalCustomers);
    }
}

class SavingAccount extends Bank{
    int balance = 500;
    SavingAccount(){
        balance++;
        System.out.println("Saving Constructor");
    }
    void calculateInterest(){
        int a=10;
        int b = ++a + a++ + --a + a--;
        System.out.println("Balance: "+balance);
        System.out.println("Final Value of a: "+ a);
        System.out.println("Value of b: "+ b);
    }
}

class CurrentAccount extends Bank{
    int overdraft = 2000;
    CurrentAccount(){
        overdraft++;
        System.out.println("Current Constructor");
    }
    void accountType(int choice){
        switch (choice){
            case 1:
                System.out.println("Business Account");
                break;
            case 2:
                System.out.println("Premier Account");
                break;
            default:
                System.out.println("Normal Account");
                break;
        }
    }
    void checkLimit(){
        if (overdraft>=2000){
            System.out.println("High Overdraft");
        } else {
            System.out.println("Low Overdraft");
        }
    }
}

class LoanAccount extends Bank{
    int loanAmount = 100000;
    LoanAccount(){
     loanAmount++;
        System.out.println("Loan Constructor");
    }
    void loanStatus(){
        if (loanAmount>100000){
            System.out.println("Loan Approved");
        } else {
            System.out.println("Loan Pending");
        }
    }
}

public class Tree1 {
    public static void main(String[] args){
        SavingAccount s1 = new SavingAccount();
        s1.bankRules();
        s1.calculateInterest();
        System.out.println("------------------------------------");
        CurrentAccount c1 = new CurrentAccount();
        c1.bankRules();
        c1.displayBank();
        c1.accountType(2);
        c1.checkLimit();
        System.out.println("------------------------------------");
        LoanAccount l1 = new LoanAccount();
        l1.bankRules();
        l1.displayBank();
        l1.loanStatus();
        System.out.println("------------------------------------");
    }
}

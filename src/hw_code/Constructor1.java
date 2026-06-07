//PS: Create a Java program for a Bank Account Management System using constructors.
package hw_code;

class BankAccount {

    int accountNumber;
    String customerName;
    double balance;

    // Default Constructor3
    BankAccount() {

        System.out.println("Welcome To SBI Bank");
        System.out.println("-----------------------");
    }

    // Parameterized Constructor3
    BankAccount(int accNo, String name, double bal) {

        accountNumber = accNo;
        customerName = name;
        balance = bal;
    }

    void displayAccount() {

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Balance : " + balance);
    }

    void checkBalance() {

        if(balance >= 1000) {

            System.out.println("Minimum Balance Maintained");
        }
        else {

            System.out.println("Low Balance");
        }

        System.out.println("-----------------------");
    }
}

public class Constructor1 {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        BankAccount c1 = new BankAccount(101,"Shankar",5000);
        c1.displayAccount();
        c1.checkBalance();

        BankAccount c2 = new BankAccount(102,"Rahul",700);
        c2.displayAccount();
        c2.checkBalance();
    }
}

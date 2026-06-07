package basic_code;
/*
 *
 * A bank wants to develop a Smart ATM System.

The system should:

check PIN---------ok
withdraw amount---ok
deposit money-----ok
show balance-------ok
use static variable------ok
use final variable-------ok
use constructor----------ok
use if-else and switch case----------ok

If withdrawal amount is greater than balance,
show "Insufficient Balance".


 *
 *
 */

class ATM {
    // Static variable
    static String bankName = "Tata STRIVE Bank";
    // final variable
    // instance variable
    final int pin = 123456;
    // instance variable
    int balance;

    ATM(int b) {
        balance = b;
        System.out.println("---------------------------------------------------------------");
        System.out.println("ATM Started");
        System.out.println("---------------------------------------------------------------\n");

    }

    void checkPin(int enteredPin) {
        if (pin == enteredPin) {
            System.out.println("PIN Verified");
        } else {
            System.out.println("Invalid PIN");

        }
    }

    void transaction(int choice, int amount) {
        switch (choice) {
            case 1:
                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Withdraw Success");

                } else {
                    System.out.println("Insufficient Balance");

                }
                break;
            case 2:
                balance = balance + amount;
                System.out.println("Deposit Success");

            default:
                System.out.println("Invalid Choice");

        }
    }

    void displayBalance() {
        System.out.println("Bank : " + bankName);
        System.out.println("Balance : " + balance);
    }

}

public class CaseStudy3 {
    public static void main(String args[]) {
        ATM a1 = new ATM(50000);
        a1.checkPin(12345);
        a1.transaction(1, 20000);
        a1.displayBalance();
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        ATM a2 = new ATM(50000);
        a2.checkPin(123456);
        a2.transaction(1, 20000);
        a2.displayBalance();
    }
}

package Extra;

class ATM {
    // Static variable
    static String bankName = "Tata STRIVE Bank";

    // Final variable
    final int pin = 123456;

    // Instance variable
    int balance;

    // Constructor
    ATM(int b) {
        balance = b;
        System.out.println("-------------------------------------------------");
        System.out.println("ATM Started");
        System.out.println("-------------------------------------------------");
    }

    // Method to check PIN
    void checkPin(int enteredPin) {
        if (pin == enteredPin) {
            System.out.println("PIN Verified");
        } else {
            System.out.println("Invalid PIN");
        }
    }

    // Method to withdraw money
    void transaction(int choice, int amount) {
        switch (choice) {
            case 1:
                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Withdraw Success");
                } else {
                    System.out.println("Insufficient Amount");
                }
                break;
            case 2:
                balance += amount;
                System.out.println("Deposit Successful. Current Balance: " + balance);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
        void displayBalance(){
            System.out.println("Bank Name: " + bankName);
            System.out.println("Balance: " + balance);
        }

    }

    public class CaseStudy5 {
        public static void main(String[] args) {
            ATM a1 = new ATM(50000);
            a1.checkPin(12345);
            a1.transaction(1, 20000);
            a1.displayBalance();
            System.out.println("------------------------------------");
            System.out.println("------------------------------------");
            ATM a2 = new ATM(50000);
            a2.checkPin(123456);
            a2.transaction(1, 20000);
            a2.displayBalance();
        }
    }


package june;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        int balance = 5000;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter withdrawal amount:");
            int amount = sc.nextInt();

            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than 0");
            }

            if (amount > balance) {
                throw new ArithmeticException("Insufficient Balance");
            }

            balance = balance - amount;

            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);

        } catch (ArithmeticException e) {

            System.out.println("Transaction Failed: " + e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println("Invalid Input: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("Some unexpected error occurred");

        } finally {

            System.out.println("Thank you for using the SBI ATM.");
            sc.close();
        }

        System.out.println("----------Program Ended------------------");
    }
}
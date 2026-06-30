package casestudy2.main;

import casestudy2.banking.BankAccount;
import casestudy2.banking.PremiumSavingsAccount;

public class BankingSystem {

    public static void main(String[] args) {

        try {
            BankAccount acc =
                    new PremiumSavingsAccount(
                            101,
                            "Shankar",
                            20000);

            acc.displayAccount();
            acc.accountType();

            acc.deposit(5000);
            acc.withdraw(3000);

            acc.deposit(2000);
            acc.withdraw(1000);

            acc.deposit(1500);

            acc.showTransactions();

            acc.withdraw(50000);

        } catch (Exception e) {

            System.out.println("\nException : "
                    + e.getMessage());

        }
    }
}

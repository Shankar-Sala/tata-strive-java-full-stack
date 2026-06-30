package casestudy2.banking;

public class PremiumSavingsAccount extends SavingsAccount {

    public PremiumSavingsAccount(int accountNumber,
                                 String holderName,
                                 double balance) {

        super(accountNumber, holderName, balance);
    }

    @Override
    public void accountType() {
        System.out.println("Account Type : Premium Savings Account");
    }
}

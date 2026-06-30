package casestudy2.banking;

public abstract class BankAccount implements TransactionRules {


    protected int accountNumber;
    protected String holderName;
    protected double balance;

    protected String[] transactions = new String[5];
    protected int count = 0;

    public BankAccount(int accountNumber,
                       String holderName,
                       double balance) {

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    protected void addTransaction(String transaction) {

        if (count < 5) {
            transactions[count++] = transaction;
        } else {
            for (int i = 0; i < 4; i++) {
                transactions[i] = transactions[i + 1];
            }
            transactions[4] = transaction;
        }
    }

    public void showTransactions() {

        System.out.println("\nLast Transactions:");

        for (String t : transactions) {
            if (t != null) {
                System.out.println(t);
            }
        }
    }

    public void displayAccount() {

        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : " + balance);
    }

    public abstract void accountType();
}

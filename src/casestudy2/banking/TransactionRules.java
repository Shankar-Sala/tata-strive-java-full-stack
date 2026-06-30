package casestudy2.banking;

public interface TransactionRules {

    void deposit(double amount);

    void withdraw(double amount) throws Exception;
}

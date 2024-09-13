import java.util.ArrayList;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private ArrayList<String> transactionHistory;

    public BankAccount(String accountNumber, String accountHolder,  double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Initalised balance: $" + initialBalance);
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposit of: $" + amount + ". Total is now: $" + balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactionHistory.add("Withdraw of: $" + amount + ". Total is now: $" + balance); 
        
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<String> getTransactionHisory() {
        return transactionHistory;
    }

    public void getAccountDetails() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("Transaction history: " + transactionHistory);
        
    }

    public void transfer(BankAccount recipient, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            recipient.deposit(amount);
            transactionHistory.add("Transferred: $" + amount + " to account " + recipient.getAccountNumber());

        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }



}
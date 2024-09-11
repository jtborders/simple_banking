import java.util.HashMap;

public class Bank {
    private HashMap<String, BankAccount> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void createAccount(String accountHolder, double initialBalance) {
        String accountNumber = "ABC" + (accounts.size() + 1);
        System.out.println("Your account number is " + accountNumber);
        BankAccount newAccount = new BankAccount(accountNumber, accountHolder, initialBalance);
        accounts.put(accountNumber, newAccount);
    }


    public BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void deposit(String accountNumber, double amount) {
        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void transfer(String accountNumber, String toAccountNumber, double amount) {
        BankAccount account = getAccount(accountNumber);
        BankAccount toAccount = getAccount(toAccountNumber);
        if (account != null && toAccount != null) {
            account.transfer(toAccount, amount);
        } else {
            System.out.println("One or both accounts not found.");
        }
    }
    
    public void viewAccount(String accountNumber) {
        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            account.getAccountDetails();
        } else {
            System.out.println("Account not found.");
        }
    }

}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Transfer Money");
        System.out.println("5. Check Balance");
        System.out.println("6. View Account Details");
        System.out.println("7. Exit");


        while (true) {

    
            int option = scan.nextInt();

            if (option == 1) {
                System.out.println("Enter account holder's last name: ");
                String name = scan.next();
                System.out.println("Enter initial balance: ");
                double balance = scan.nextDouble();
                bank.createAccount(name, balance);
                
            }

            else if (option == 2) {
                System.out.println("Enter account number: ");
                String depositAccount = scan.next();
                System.out.println("Enter amount to deposit: ");
                double depositAmount = scan.nextDouble();
                bank.deposit(depositAccount, depositAmount);
                System.out.println("Money deposited successfully.");
                
            }

            else if (option == 3) {
                System.out.println("Enter account number: ");
                String withdrawAccount = scan.next();
                System.out.println("Enter amount to withdraw: ");
                double withdrawAmount = scan.nextDouble();
                bank.withdraw(withdrawAccount, withdrawAmount);
                System.out.println("Money withdrawn successfully.");
                
            }

            else if (option == 4) {
                System.out.println("Enter source account number: ");
                String fromAccount = scan.next();
                System.out.println("Enter target account number: ");
                String toAccount = scan.next();
                System.out.println("Enter amount to transfer: ");
                double transferAmount = scan.nextDouble();
                bank.transfer(fromAccount, toAccount, transferAmount);
                System.out.println("Money transferred successfully.");
                
            }

            else if (option == 5) {
                System.out.println("Enter account number: ");
                String checkBalanceAccount = scan.next();
                BankAccount account = bank.getAccount(checkBalanceAccount);
                if (account != null) {
                    System.out.println("Balance: $" + account.getBalance());
                } else {
                    System.out.println("Account not found.");
                }
                

            }

            else if (option == 6) {
                System.out.println("Enter account number: ");
                String accountNumber = scan.next();
                bank.viewAccount(accountNumber);
                
            }

            else if (option == 7) {
                System.out.println("Exiting...");
                
            }

            else {
                System.out.println("Invalid choice");
            }
            
        }



  
    }
}
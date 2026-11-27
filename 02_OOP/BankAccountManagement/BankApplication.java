
class BankAccount {

    // Instance variables
    private int accountNumber;
    private String customerName;
    private double balance;


    private static int totalAccounts = 0;

    // Constructor 1: Account with initial balance
    public BankAccount(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        totalAccounts++;
    }

    // Constructor 2: Account with default balance
    public BankAccount(int accountNumber, String customerName) {
        this(accountNumber, customerName, 0.0);
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Display account 
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
    }

   
    public static int getTotalAccounts() {
        return totalAccounts;
    }
}

public class BankApplication {

    public static void main(String[] args) {

        // Creating multiple account objects
        BankAccount account1 = new BankAccount(101, "Srija", 5000);
        BankAccount account2 = new BankAccount(102, "Rahul");
        BankAccount account3 = new BankAccount(103, "Priya", 7000);

    
        account1.deposit(2000);
        account1.withdraw(1000);

        account2.deposit(3000);
        account2.withdraw(500);

     
        System.out.println("\n--- Account 1 ---");
        account1.displayDetails();

        System.out.println("\n--- Account 2 ---");
        account2.displayDetails();

        System.out.println("\n--- Account 3 ---");
        account3.displayDetails();

        System.out.println("\nTotal Accounts: "
                + BankAccount.getTotalAccounts());
    }
}

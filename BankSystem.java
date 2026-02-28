import java.util.Scanner;
public class BankSystem {
    static String accountHolder = "John Doe";
    static double balance = 1000.0;
    static int accountNumber = 123456789;
    static boolean isActive = true;
    public static void main (String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank System");
        displayMenu();
        int option = scanner.nextInt();

        while(option !=5)
        {
            switch(option)
            {
                case 1:
                    viewBalance();
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount <= 0){
                        System.out.println("Invalid amount. Please enter a positive number.");
                    } else {
                    deposit(depositAmount);
                    }
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    if(withdrawAmount <= 0){
                        System.out.println("Invalid amount. Please enter a positive number.");
                    } else {
                    withdraw(withdrawAmount);
                    }
                    break;
                case 4:
                    printAccountDetails(accountHolder, accountNumber, isActive);
                    break;
                default: 
                    System.out.println("Invalid option. Please choose a valid option from the menu.");
                    break;
            }
            displayMenu();
            option = scanner.nextInt();
        }
        System.out.println("Thank you for using the Bank System. Goodbye!");
        scanner.close();    

    }
    public static void displayMenu(){
        System.out.println("Choose one of the following options:");
        System.out.println("1. View Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. View Account details");
        System.out.println("5. Exit");
    }
    public static void viewBalance(){
        System.out.println("Your balance is: " + balance);
    }
    public static void deposit(double amount){
        balance += amount;
        System.out.println("You have deposited: " + amount);
    }
    public static void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("You have withdrawn: " + amount);
        }
    }
    public static void printAccountDetails(String accountHolder, int accountNumber, boolean isActive){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Status: " + (isActive ? "Active" : "Inactive"));
    }

}

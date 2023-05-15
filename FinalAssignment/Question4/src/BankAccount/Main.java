package BankAccount;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a new bank account
        BankAccount account = new BankAccount("1234567890",0);

        // Display options to the user
        System.out.println("Welcome to XYZ Bank!");
        System.out.println("Please select an option:");
        System.out.println("1. Deposit money");
        System.out.println("2. Withdraw money");
        System.out.println("3. Check balance");
        System.out.println("4. Exit");

        // Process user input
        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);
    }
}



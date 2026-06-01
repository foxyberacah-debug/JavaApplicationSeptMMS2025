import java.util.Scanner;

public class CreditLimitCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();

        System.out.print("Enter beginning balance: ");
        int beginningBalance = input.nextInt();

        System.out.print("Enter total charges: ");
        int charges = input.nextInt();

        System.out.print("Enter total credits: ");
        int credits = input.nextInt();

        System.out.print("Enter credit limit: ");
        int creditLimit = input.nextInt();

        int newBalance = beginningBalance + charges - credits;

        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("New Balance: " + newBalance);

        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        }

        input.close();
    }
}
import java.util.Scanner;

public class FairTax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0;

        System.out.print("Housing Expense: ");
        total += input.nextDouble();

        System.out.print("Food Expense: ");
        total += input.nextDouble();

        System.out.print("Clothing Expense: ");
        total += input.nextDouble();

        System.out.print("Transportation Expense: ");
        total += input.nextDouble();

        System.out.print("Education Expense: ");
        total += input.nextDouble();

        System.out.print("Health Care Expense: ");
        total += input.nextDouble();

        System.out.print("Vacation Expense: ");
        total += input.nextDouble();

        double fairTax = total * 0.23;

        System.out.printf("%nTotal Expenses: %.2f%n", total);
        System.out.printf("Estimated FairTax: %.2f%n", fairTax);
    }
}
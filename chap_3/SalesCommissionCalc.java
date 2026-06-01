import java.util.Scanner;

public class SalesCommissionCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalSales = 0.0;
        int item;

        System.out.println("Enter item numbers sold.");
        System.out.println("Enter 0 to finish.");

        do {
            System.out.print("Item number: ");
            item = input.nextInt();

            switch (item) {
                case 1:
                    totalSales += 239.99;
                    break;
                case 2:
                    totalSales += 129.75;
                    break;
                case 3:
                    totalSales += 99.95;
                    break;
                case 4:
                    totalSales += 350.89;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid item number.");
            }

        } while (item != 0);

        double earnings = 200 + (0.09 * totalSales);

        System.out.printf("%nTotal Sales: $%.2f%n", totalSales);
        System.out.printf("Earnings: $%.2f%n", earnings);

        input.close();
    }
}
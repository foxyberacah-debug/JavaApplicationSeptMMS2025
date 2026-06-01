import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int response;

        do {
            System.out.print("Enter 1 or 2: ");
            response = input.nextInt();

            if (response != 1 && response != 2) {
                System.out.println("Invalid input. Try again.");
            }

        } while (response != 1 && response != 2);

        System.out.println("Valid input accepted.");

        input.close();
    }
}
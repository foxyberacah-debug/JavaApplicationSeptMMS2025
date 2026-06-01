import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;

        System.out.print("Enter number 1: ");
        int largest = input.nextInt();

        while (counter < 10) {

            System.out.printf("Enter number %d: ", counter + 1);
            int number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.println("Largest number is: " + largest);

        input.close();
    }
}
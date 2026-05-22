import java.util.Scanner;

public class Product{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c, result;

        System.out.print("Enter first integer: ");
        a = input.nextInt();

        System.out.print("Enter second integer: ");
        b = input.nextInt();

        System.out.print("Enter third integer: ");
        c = input.nextInt();

        result = a * b * c;

        System.out.printf("Product is %d%n", result);
    }
}

import java.util.Scanner;

public class JavaPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 integers:");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int num6 = input.nextInt();
        int num7 = input.nextInt();
        int num8 = input.nextInt();
        int num9 = input.nextInt();
        int num10 = input.nextInt();

        int sum1 = num1 + num5 + num10;
        int sum2 = num3 + num8 + num2;

        int product = sum1 * sum2;

        int sum3 = num4 + num7 + num6 + num9;

        int result = sum3 - product;

        System.out.println("Result = " + result);

        if (result >= 100) {
            System.out.println("Hooray, I did it!");
        } else {
            System.out.println("I still need to learn more in Java.");
        }

        input.close();
    }
}
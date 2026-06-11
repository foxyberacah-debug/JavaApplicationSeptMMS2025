import java.util.Random;

public class FirstBankAccountGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        StringBuilder accountNumber = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            accountNumber.append(random.nextInt(10));
        }

        System.out.println("FirstBank Account Number: " + accountNumber);
    }
}
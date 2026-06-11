import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        String characters =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "abcdefghijklmnopqrstuvwxyz" +
                "0123456789" +
                "!@#$%^&*()_+-=[]{}|;:,.<>?";

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < 15; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        System.out.println("Generated Password: " + password);
    }
}
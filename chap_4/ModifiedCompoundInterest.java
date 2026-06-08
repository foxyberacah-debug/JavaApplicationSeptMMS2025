public class ModifiedCompoundInterest {
    public static void main(String[] args) {

        double principal = 1000.0;

        for (int rate = 5; rate <= 10; rate++) {

            System.out.printf("%nInterest Rate: %d%%%n", rate);
            System.out.println("Year\tAmount");

            for (int year = 1; year <= 10; year++) {
                double amount =
                        principal * Math.pow(1.0 + rate / 100.0, year);

                System.out.printf("%d\t%.2f%n", year, amount);
            }
        }
    }
}
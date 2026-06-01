public class WorldPopulationGrowth {

    public static void main(String[] args) {

        double population = 8_200_000_000.0;
        double growthRate = 0.008;

        double initialPopulation = population;
        boolean doubled = false;

        System.out.printf(
                "%-5s %-20s %-20s%n",
                "Year",
                "Population",
                "Increase");

        for (int year = 1; year <= 75; year++) {

            double increase = population * growthRate;

            population += increase;

            System.out.printf(
                    "%-5d %-20.0f %-20.0f%n",
                    year,
                    population,
                    increase);

            if (!doubled &&
                    population >= initialPopulation * 2) {

                System.out.println(
                        "\nPopulation doubles in year "
                                + year);

                doubled = true;
            }
        }
    }
}
import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int score = 0;

        System.out.println("Question 1");
        System.out.println("Which gas is most associated with global warming?");
        System.out.println("1. Oxygen");
        System.out.println("2. Carbon Dioxide");
        System.out.println("3. Nitrogen");
        System.out.println("4. Helium");

        if (input.nextInt() == 2)
            score++;

        System.out.println("\nQuestion 2");
        System.out.println("What is the main source of human-produced CO2?");
        System.out.println("1. Burning fossil fuels");
        System.out.println("2. Rainfall");
        System.out.println("3. Moonlight");
        System.out.println("4. Wind");

        if (input.nextInt() == 1)
            score++;

        System.out.println("\nQuestion 3");
        System.out.println("Which organization studies climate change?");
        System.out.println("1. FIFA");
        System.out.println("2. WHO");
        System.out.println("3. IPCC");
        System.out.println("4. NASA TV");

        if (input.nextInt() == 3)
            score++;

        System.out.println("\nQuestion 4");
        System.out.println("Global warming skeptics often question:");
        System.out.println("1. Climate models");
        System.out.println("2. Mathematics");
        System.out.println("3. Gravity");
        System.out.println("4. Seasons");

        if (input.nextInt() == 1)
            score++;

        System.out.println("\nQuestion 5");
        System.out.println("What can help reduce emissions?");
        System.out.println("1. Renewable energy");
        System.out.println("2. More pollution");
        System.out.println("3. Burning more coal");
        System.out.println("4. None");

        if (input.nextInt() == 1)
            score++;

        System.out.println("\nScore: " + score);

        if (score == 5)
            System.out.println("Excellent");
        else if (score == 4)
            System.out.println("Very good");
        else
            System.out.println(
                "Time to brush up on your knowledge of global warming");

        System.out.println("\nSources:");
        System.out.println("www.ipcc.ch");
        System.out.println("climate.nasa.gov");
    }
}
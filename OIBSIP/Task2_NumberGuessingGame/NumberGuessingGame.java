import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound) + lowerBound;
        int guess;
        int attempts = 0;
        int maxAttempts = 7;

        System.out.println("🎯 Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have " + maxAttempts + " attempts.\n");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                System.out.println("🎉 Congratulations! You guessed the number correctly.");
                System.out.println("Attempts taken: " + attempts);
                sc.close();
                return;
            } else if (guess < numberToGuess) {
                System.out.println("📉 Too low! Try again.");
            } else {
                System.out.println("📈 Too high! Try again.");
            }
        }

        System.out.println("\n❌ You have used all attempts!");
        System.out.println("The correct number was: " + numberToGuess);
        sc.close();
    }
}

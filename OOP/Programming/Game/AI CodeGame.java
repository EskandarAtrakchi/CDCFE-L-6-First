import java.util.Scanner;

public class Game {

  public static void main(String[] args) {

    // Create a Scanner object to read input from the command line
    Scanner scanner = new Scanner(System.in);

    // Display the game title and instructions
    System.out.println("--- My Game ---");
    System.out.println("Enter a number between 1 and 10 to guess the secret number.");

    // Generate a random number between 1 and 10
    int secret = (int)(Math.random() * 10) + 1;

    // Loop until the player guesses the secret number
    while (true) {
      // Read the player's guess
      System.out.print("Enter your guess: ");
      int guess = scanner.nextInt();

      // Check if the player's guess is correct
      if (guess == secret) {
        // If the guess is correct, display a winning message and break out of the loop
        System.out.println("Congratulations! You guessed the secret number.");
        break;
      } else {
        // If the guess is incorrect, display a hint and continue the loop
        System.out.println("Sorry, that's not the secret number. Try again.");
        if (guess > secret) {
          System.out.println("Hint: the secret number is less than your guess.");
        } else {
          System.out.println("Hint: the secret number is greater than your guess.");
        }
      }
    }

    // Close the Scanner object
    scanner.close();
  }
}
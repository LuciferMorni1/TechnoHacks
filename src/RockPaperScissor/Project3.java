package RockPaperScissor;
//--ROCK, PAPER, SCISSORS GAME--//
import java.util.Random;
import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.print("Enter your choice (Rock, Paper, or Scissors): ");
        String userChoice = scanner.nextLine();
        // Generate a random choice for the computer
        int randomIndex = random.nextInt(choices.length);
        String computerChoice = choices[randomIndex];
        System.out.println("Computer's choice: " + computerChoice);
        System.out.println("Your choice: " + userChoice);
        // Determine the winner
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
                (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
        scanner.close();
    }
}

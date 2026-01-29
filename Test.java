import java.util.Random;
import java.util.Scanner;

class NumberGame {

    private int number;
    private int attempts = 0;
    private final int limit = 5;

    NumberGame() {
        Random r = new Random();
        number = r.nextInt(100) + 1;
    }

    void play() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 100");

        while (attempts < limit) {
            try {
                System.out.print("Enter guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                    return;
                } else if (guess > number) {
                    System.out.println("Too high");
                } else {
                    System.out.println("Too low");
                }

            } catch (Exception e) {
                System.out.println("Invalid input");
                sc.next();
            }
        }

        System.out.println("Game over. Number was: " + number);
        sc.close();
    }

    public static void main(String[] args) {
        NumberGame game = new NumberGame();
        game.play();
    }
}

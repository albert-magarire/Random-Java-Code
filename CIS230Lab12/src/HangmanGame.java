import java.util.Scanner;
import java.util.Random;

public class HangmanGame {
    public static void main(String[] args) {
        String[] words = {"write", "that", "java", "programming", "hangman"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean playAgain = true;
        while (playAgain) {
            String selectedWord = words[random.nextInt(words.length)];
            StringBuilder guessedWord = new StringBuilder(selectedWord.length());
            for (int i = 0; i < selectedWord.length(); i++) {
                guessedWord.append('*');
            }

            int misses = 0;
            while (guessedWord.toString().contains("*")) {
                System.out.print("(Guess) Enter a letter in word " + guessedWord + " > ");
                char guess = scanner.next().charAt(0);
                boolean correctGuess = false;

                for (int i = 0; i < selectedWord.length(); i++) {
                    if (selectedWord.charAt(i) == guess) {
                        guessedWord.setCharAt(i, guess);
                        correctGuess = true;
                    }
                }

                if (!correctGuess) {
                    misses++;
                    System.out.println("Incorrect guess. Misses: " + misses);
                }
            }

            System.out.println("The word is " + selectedWord + ". You missed " + misses + " time" + (misses == 1 ? "" : "s"));
            System.out.print("Do you want to guess for another word? Enter y: ");
            char playAgainChoice = scanner.next().charAt(0);
            playAgain = (playAgainChoice == 'y' || playAgainChoice == 'Y');
        }

        System.out.println("Thanks for playing!");
    }
}

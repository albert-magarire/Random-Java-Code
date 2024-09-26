import java.util.Scanner;

public class ScoreAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[100];
        int totalScores = 0;
        int sum = 0;


        int score;
        while (true) {
            System.out.print("Enter a new score: ");
            score = scanner.nextInt();
            if (score < 0) {
                break;
            }
            scores[totalScores] = score;
            totalScores++;
            sum += score;
        }

        double average = (double) sum / totalScores;

        int aboveOrEqualCount = 0;
        int belowCount = 0;
        for (int i = 0; i < totalScores; i++) {
            if (scores[i] >= average) {
                aboveOrEqualCount++;
            } else {
                belowCount++;
            }
        }

        System.out.println("Average score: " + average);
        System.out.println("Number of scores above or equal to the average: " + aboveOrEqualCount);
        System.out.println("Number of scores below the average: " + belowCount);

        scanner.close();
    }
}

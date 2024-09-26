import java.util.Scanner;

public class GradeAssigner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        double[] scores = new double[numStudents];

        System.out.print("Enter " + numStudents + " scores: ");
        for (int i = 0; i < numStudents; i++) {
            scores[i] = scanner.nextDouble();
        }

        System.out.println("\nGrades:");
        for (int i = 0; i < numStudents; i++) {
            char grade = assignGrade(scores[i], findHighestScore(scores));
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }

        scanner.close();
    }

    public static char assignGrade(double score, double best) {
        if (score >= best - 10) {
            return 'A';
        } else if (score >= best - 20) {
            return 'B';
        } else if (score >= best - 30) {
            return 'C';
        } else if (score >= best - 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static double findHighestScore(double[] scores) {
        double highestScore = Double.MIN_VALUE;
        for (double score : scores) {
            if (score > highestScore) {
                highestScore = score;
            }
        }
        return highestScore;
    }
}

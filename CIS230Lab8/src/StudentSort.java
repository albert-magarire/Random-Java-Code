import java.util.Scanner;

public class StudentSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        String[] names = new String[numStudents];
        double[] scores = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter a student name: ");
            names[i] = scanner.next();
            System.out.print("Enter a student score: ");
            scores[i] = scanner.nextDouble();
        }

        selectionSort(scores, names);
        System.out.println("Names in decreasing order of their scores are:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(names[i] + " " + scores[i]);
        }

        scanner.close();
    }

    public static void selectionSort(double[] scores, String[] names) {
        for (int i = 0; i < scores.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] > scores[maxIndex]) {
                    maxIndex = j;
                }
            }
            double tempScore = scores[maxIndex];
            scores[maxIndex] = scores[i];
            scores[i] = tempScore;
            String tempName = names[maxIndex];
            names[maxIndex] = names[i];
            names[i] = tempName;
        }
    }
}

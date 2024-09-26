import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        int distinctCount = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();

            boolean isDistinct = true;
            for (int j = 0; j < distinctCount; j++) {
                if (numbers[j] == number) {
                    isDistinct = false;
                    break;
                }
            }

            if (isDistinct) {
                numbers[distinctCount] = number;
                distinctCount++;
            }
        }

        System.out.println("The number of distinct numbers is: " + distinctCount);

        System.out.print("The distinct numbers are:");
        for (int i = 0; i < distinctCount; i++) {
            System.out.print(" " + numbers[i]);
        }

        scanner.close();
    }
}

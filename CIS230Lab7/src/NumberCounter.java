import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] counter = new int[101];
        int number;
        System.out.println("Enter numbers between 1 and 100 (enter 0 to end input):");
        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number >= 1 && number <= 100) {
                counter[number]++;
            } else {
                System.out.println("Number must be between 1 and 100.");
            }
        }

        System.out.println("\nOccurrences of each number:");
        for (int i = 1; i <= 100; i++) {
            if (counter[i] > 0) {
                System.out.print(i + " occurs " + counter[i]);
                if (counter[i] > 1) {
                    System.out.print(" times");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}

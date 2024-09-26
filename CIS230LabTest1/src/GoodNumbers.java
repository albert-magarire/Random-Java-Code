import java.util.Scanner;

public class GoodNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int excellent = 0;
        int good = 0;
        int average = 0;
        int belowAverage = 0;
        int poor = 0;

        System.out.println("Enter integers (terminate with 0):");

        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }


                if (num >= 90) {
                    excellent += 1;
                } else if (num >= 80) {
                    good += 1;
                } else if (num >= 70) {
                    average += 1;
                } else if (num >= 60) {
                    belowAverage += 1;
                } else {
                    poor += 1;
                }

        }

        System.out.println("Excellent: " + excellent);
        System.out.println("Good: " + good);
        System.out.println("Average: " + average);
        System.out.println("Below Average: " + belowAverage);
        System.out.println("Poor: " + poor);

        scanner.close();
    }
}

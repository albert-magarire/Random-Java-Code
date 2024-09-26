import java.util.Scanner;

public class StatisticsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ten numbers:");
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double meanResult = mean(numbers);
        double deviationResult = deviation(numbers);
        System.out.println("The mean is " + meanResult);
        System.out.println("The standard deviation is " + deviationResult);

        scanner.close();
    }

    public static int indexOfSmallestElement(double[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        double min = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static double mean(double[] x) {
        if (x == null || x.length == 0) {
            return 0;
        }

        double sum = 0;
        for (double num : x) {
            sum += num;
        }

        return sum / x.length;
    }
    public static double deviation(double[] x) {
        double meanValue = mean(x);
        double sumSquaredDiff = 0;

        for (double num : x) {
            sumSquaredDiff += Math.pow(num - meanValue, 2);
        }

        return Math.sqrt(sumSquaredDiff / (x.length - 1));
    }
}

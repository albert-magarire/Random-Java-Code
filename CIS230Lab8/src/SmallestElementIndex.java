import java.util.Scanner;

public class SmallestElementIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");

        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        int smallestIndex = indexOfSmallestElement(numbers);
        System.out.println("Index of the smallest element: " + smallestIndex);
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
}

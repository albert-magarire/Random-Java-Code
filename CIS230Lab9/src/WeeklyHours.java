import java.util.Arrays;

public class WeeklyHours {

    public static void main(String[] args) {
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        int[] totalHours = new int[hours.length];
        for (int i = 0; i < hours.length; i++) {
            int sum = 0;
            for (int j = 0; j < hours[i].length; j++) {
                sum += hours[i][j];
            }
            totalHours[i] = sum;
        }

        Integer[] employeeNumbers = new Integer[hours.length];
        for (int i = 0; i < hours.length; i++) {
            employeeNumbers[i] = i;
        }

        for (int i = 1; i < totalHours.length; i++) {
            int currentTotalHours = totalHours[i];
            int currentEmployeeNumber = employeeNumbers[i];
            int j = i - 1;

            while (j >= 0 && totalHours[j] < currentTotalHours) {
                totalHours[j + 1] = totalHours[j];
                employeeNumbers[j + 1] = employeeNumbers[j];
                j--;
            }

            totalHours[j + 1] = currentTotalHours;
            employeeNumbers[j + 1] = currentEmployeeNumber;
        }

        System.out.println("Employee\tTotal Hours");
        System.out.println("-------------------------");
        for (int i = 0; i < hours.length; i++) {
            System.out.println(employeeNumbers[i] + "\t\t" + totalHours[i]);
        }
    }
}

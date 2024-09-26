import java.util.Random;

public class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(5, 5);
        printMatrix(matrix);

        int maxRowIndex = findRowWithMostOnes(matrix);
        int maxColIndex = findColumnWithMostOnes(matrix);

        System.out.println("The largest row index is " + maxRowIndex);
        System.out.println("The largest column index is " + maxColIndex);
    }

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int findRowWithMostOnes(int[][] matrix) {
        int maxRowSum = 0;
        int maxRowIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = sumRow(matrix[i]);
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                maxRowIndex = i;
            }
        }

        return maxRowIndex;
    }

    public static int findColumnWithMostOnes(int[][] matrix) {
        int maxColSum = 0;
        int maxColIndex = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            int colSum = sumColumn(matrix, j);
            if (colSum > maxColSum) {
                maxColSum = colSum;
                maxColIndex = j;
            }
        }

        return maxColIndex;
    }

    public static int sumRow(int[] row) {
        int sum = 0;
        for (int value : row) {
            sum += value;
        }
        return sum;
    }

    public static int sumColumn(int[][] matrix, int column) {
        int sum = 0;
        for (int[] row : matrix) {
            sum += row[column];
        }
        return sum;
    }
}

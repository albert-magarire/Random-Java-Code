public class PentagonalNumbers {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;
        final int TOTAL_NUMBERS = 100;

        for (int i = 1; i <= TOTAL_NUMBERS; i++) {
            System.out.printf("%7d", getPentagonalNumber(i));

            if (i % NUMBERS_PER_LINE == 0) {
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}

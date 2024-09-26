public class SeriesSummation {
    public static void main(String[] args) {
        double sum = 0;
        int numerator = 1;
        int denominator = 1;

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                sum += (double)numerator / (denominator * denominator);
            } else {
                sum -= (double)numerator / (denominator * denominator);
            }
            numerator += 2;
            denominator += 3;

        }
        System.out.println("Summation of the series: " + sum);
    }
}

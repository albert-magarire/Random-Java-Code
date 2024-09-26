public class Conversion {
    public static void main(String[] args) {
        System.out.println("Feet    Meters              Meters      Feet");
        System.out.println("---------------------------------------------");
        for (float feet = 1, meters = 20; feet <= 10.0; feet++, meters += 5.0) {
            System.out.printf("%4.1f    %-7.3f             %-4.1f    %-7.3f%n",
                    feet, footToMeter(feet), meters, meterToFoot(meters));
        }
    }
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}

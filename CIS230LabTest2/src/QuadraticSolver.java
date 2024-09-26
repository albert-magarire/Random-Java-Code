import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The quadratic equation is in the format ax^2 + bx + c = 0");
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();

        Double[] eqn = {a, b, c};
        double[] roots = new double[2];

        int numRealRoots = solveQuadratic(eqn, roots);
        System.out.println("The quadratic equation has " + numRealRoots + "real roots.");

        if (numRealRoots > 0) {
            System.out.println("Real roots:");
            for (int i = 0; i < numRealRoots; i++) {
                System.out.println("Root " + (i + 1) + ": " + roots[i]);
            }
        }
    }

    public static int solveQuadratic(Double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
            return 2;
        } else if (discriminant == 0) {
            roots[0] = -b / (2 * a);
            return 1;
        } else {
            return 0;
        }
    }
}

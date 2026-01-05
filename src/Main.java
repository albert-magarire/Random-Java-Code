import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int numA;
        int numB;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        numA = input.nextInt();
        System.out.println("Enter second number");
        numB = input.nextInt();

        System.out.println("The sume of the two number is: " + numA + numB);

    }
}
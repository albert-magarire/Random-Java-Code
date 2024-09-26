import java.util.Random;

public class CrapsGame {
    private static final int CRAPS = 0;
    private static final int NATURAL = 1;
    private static final int POINT = 2;
    private static final int WIN = 3;
    private static final int LOSE = 4;
    private static final int UNDECIDED = 5;

    public static void main(String[] args) {
        playCraps();
    }

    public static void playCraps() {
        int point = UNDECIDED;
        int sum;

        sum = rollADie1() + rollADie2();
        int result = checkSumOfDice(sum);

        if (result == CRAPS || result == NATURAL) {
            printResult(sum, result);
            return;
        } else {
            point = sum;
            printResult(sum, point);
        }

        while (true) {
            sum = rollADie1() + rollADie2();
            if (sum == point) {
                printResult(sum, WIN);
                return;
            } else if (sum == 7) {
                printResult(sum, LOSE);
                return;
            } else {
                printResult(sum);
            }
        }
    }

    public static int rollADie1() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
    public static int rollADie2() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public static int checkSumOfDice(int sum) {
        if (sum == 2 || sum == 3 || sum == 12) {
            return CRAPS;
        } else if (sum == 7 || sum == 11) {
            return NATURAL;
        } else {
            return POINT;
        }
    }

    public static void printResult(int sum) {
        System.out.println("You rolled " + rollADie1() + " + " + rollADie2());
    }

    public static void printResult(int sum, int result) {
        switch (result) {
            case CRAPS:
                System.out.println("You rolled " + rollADie1() + " + " + rollADie2());
                System.out.println("You lose");
                break;
            case NATURAL:
                System.out.println("You rolled " + rollADie1() + " + " + rollADie2());
                System.out.println("You win");
                break;
            case WIN:
                System.out.println("You rolled " + rollADie1() + " + " + rollADie2());
                System.out.println("You win");
                break;
            case LOSE:
                System.out.println("You rolled " + rollADie1() + " + " + rollADie2());
                System.out.println("You lose");
                break;
            case POINT:
                System.out.println("point is " + sum);
                break;
        }
    }
}

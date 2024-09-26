import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        System.out.print("Enter a string for password: ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        System.out.println(isValidPassword(password));
    }

    public static String isValidPassword(String password) {
        if (password.length() < 8) {
            return "Invalid Password";
        }

        boolean hasDigit = false;
        boolean hasLetter = false;
        int digitCount = 0;
        boolean has2Digit = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                hasDigit = true;
                digitCount += 1;
            } else if (Character.isLetter(ch)) {
                hasLetter = true;
            }
            if (digitCount >= 2) {
                has2Digit = true;
            }
            if (hasDigit && hasLetter && has2Digit) {
                break;
            }
        }

        if (!hasDigit || !hasLetter || !has2Digit) {
            return "Invalid Password";
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return "Invalid Password";
            }
        }

        return "Valid Password";
    }
}

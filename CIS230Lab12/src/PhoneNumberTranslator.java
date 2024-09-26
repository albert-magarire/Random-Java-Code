public class PhoneNumberTranslator {
    public static int getNumber(char uppercaseLetter) {
        switch (uppercaseLetter) {
            case 'A': case 'B': case 'C': return 2;
            case 'D': case 'E': case 'F': return 3;
            case 'G': case 'H': case 'I': return 4;
            case 'J': case 'K': case 'L': return 5;
            case 'M': case 'N': case 'O': return 6;
            case 'P': case 'Q': case 'R': case 'S': return 7;
            case 'T': case 'U': case 'V': return 8;
            case 'W': case 'X': case 'Y': case 'Z': return 9;
            default: return -1;
        }
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a phone number (letters will be translated to digits): ");
        String phoneNumber = input.nextLine();
        input.close();

        String translatedNumber = "";

        for (int i = 0; i < phoneNumber.length(); i++) {
            char ch = phoneNumber.charAt(i);
            if (Character.isLetter(ch)) {
                translatedNumber += getNumber(Character.toUpperCase(ch));
            } else {
                translatedNumber += ch;
            }
        }

        System.out.println("Translated phone number: " + translatedNumber);
    }
}

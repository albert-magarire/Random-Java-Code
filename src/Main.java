public class Main {
    public static void main(String[] args) {
        // 1. The Blueprint works (Static)
        BankAccount.bankRules();

        // 2. The Setup works (Constructor)
        BankAccount myAccount = new BankAccount("Albert", 500.00);

        // 3. The Logic works (Methods)
        myAccount.deposit(200.00);

        // 4. The Protection works (Encapsulation)
        // myAccount.deposit(-50.00); // CRASH! Your exception stops the crime.
    }
}
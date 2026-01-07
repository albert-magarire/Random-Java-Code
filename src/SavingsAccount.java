public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String owner, double startingBalance, double interestRate) {
        super(owner, startingBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest applied. New Balance: " + balance);
    }

    @Override
    public void deposit(double amount){
        //the super.whatever statement should always be the first line
        super.deposit(amount);
        System.out.println("Savings transaction complete.");
    }
}

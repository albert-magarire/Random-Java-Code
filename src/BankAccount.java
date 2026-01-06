public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double startingBalance){
        this.owner = owner;
        this.balance = startingBalance;
    }

    public void deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }else {
            this.balance += amount;
        }
    }

    public static void bankRules(){
        System.out.println("Rules: No stealing allowed");
    }
}

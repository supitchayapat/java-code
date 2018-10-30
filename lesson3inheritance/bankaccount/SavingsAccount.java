package lesson3inheritance.bankaccount;

public class SavingsAccount extends BankAccount {
    private double interest;

    public SavingsAccount(double interest) {
        this.interest = interest;
    }


    public void addInterest() {
        double amount = getBalance() * interest;
        deposit(amount);
    }
}

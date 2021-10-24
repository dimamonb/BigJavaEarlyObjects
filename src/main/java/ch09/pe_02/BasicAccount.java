package ch09.pe_02;

public class BasicAccount extends BankAccount{

    @Override
    public void withdraw(double amount) {
        double balance = super.getBalance();
        if(balance >= amount){
            super.withdraw(amount);
        } else {
            System.out.println("Not enough money on balance");
        }
    }
}

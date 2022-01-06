package ch09.pe_02;

public class BasicAccount1 extends BankAccount {
    public BasicAccount1(){
        super();
    }
    @Override
    public void withdraw(double amount) {
        double balance = getBalance();
        if(balance >= amount){
            super.withdraw(amount);
        } else {
            System.out.println("Not enough money on balance");
        }
    }
}

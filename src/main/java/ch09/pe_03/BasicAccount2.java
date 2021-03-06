package ch09.pe_03;

public class BasicAccount2 extends BankAccount{
    public static final double PENALTY = 30;

    public BasicAccount2(){
        super();
    }
    @Override
    public void withdraw(double amount) {
        double balance = getBalance();
        if(balance >= amount){
            amount += 30;
        }
        super.withdraw(amount);
    }
}

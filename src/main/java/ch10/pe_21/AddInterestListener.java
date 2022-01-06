package ch10.pe_21;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddInterestListener implements ActionListener {
    private BankAccount bankAccount;
    private double interestRate;

    public AddInterestListener(BankAccount bankAccount, double interestRate) {
        this.bankAccount = bankAccount;
        this.interestRate = interestRate;
    }

    public void actionPerformed(ActionEvent event) {
        double interest = this.bankAccount.getBalance() * interestRate / 100;
        this.bankAccount.deposit(interest);
        System.out.println("balance: " + this.bankAccount.getBalance());
    }
}

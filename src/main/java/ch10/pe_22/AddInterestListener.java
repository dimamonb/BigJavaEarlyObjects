package ch10.pe_22;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AddInterestListener implements ActionListener {
    private double interestRate;
    private BankAccount account;
    private JLabel label;

    public AddInterestListener(double interestRate, BankAccount account, JLabel label) {
        this.interestRate = interestRate;
        this.account = account;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double interest = account.getBalance() * interestRate / 100;
        account.deposit(interest);
        label.setText("balance: " + account.getBalance());
    }
}

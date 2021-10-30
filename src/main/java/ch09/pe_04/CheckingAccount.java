package ch09.pe_04;

/**
 * A checking account has a limited number of free deposits and withdrawals.
 */
public class CheckingAccount extends BankAccount {
    public static final double FIRST_PENALTY = 20;
    public static final double NEXT_PENALTY = 30;

    private int withdrawals;

    /**
     * Constructs a checking account with a zero balance.
     */
    public CheckingAccount() {
        withdrawals = 0;
    }

    @Override
    public void withdraw(double amount) {
        final int FREE_WITHDRAWALS = 3;
        // final int WITHDRAWAL_FEE = 1;

        double balance = super.getBalance();

        //super.withdraw(amount);
        withdrawals++;
        if (withdrawals > FREE_WITHDRAWALS) {
            if (amount > balance && withdrawals == 1)
                amount += FIRST_PENALTY;
            else if (amount > balance) {
                amount += NEXT_PENALTY;
            }
            super.withdraw(amount);
        }
    }

    public void monthEnd() {
        withdrawals = 0;
    }
}


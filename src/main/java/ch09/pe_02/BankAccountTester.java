package ch09.pe_02;

public class BankAccountTester {
    public static void main(String[] args) {
        BasicAccount1 basicAccount = new BasicAccount1();
        basicAccount.deposit(500);
        System.out.println(basicAccount.getBalance());
        basicAccount.withdraw(380);
        System.out.println(basicAccount.getBalance());
        basicAccount.withdraw(400);
        System.out.println(basicAccount.getBalance());
    }
}

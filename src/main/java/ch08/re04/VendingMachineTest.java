package ch08.re04;

import java.util.Scanner;

public class VendingMachineTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product: ");
        String product = scanner.next();
        System.out.print("Insert coins: ");
        double payment = scanner.nextDouble();

        //VendingMachineProduct someProd = new VendingMachineProduct("COLA", 2.35);

        VendingMachine vendingMachine = new VendingMachine(product, payment);
        if(vendingMachine.getChange()<0){
            vendingMachine.getPrice();
        } else {
            vendingMachine.getProduct();
        }
    }
}

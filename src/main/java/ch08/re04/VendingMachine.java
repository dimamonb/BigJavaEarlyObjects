package ch08.re04;

public class VendingMachine {
    public static final double COLA = 2.35;
    private String product;
    private double price;

    public VendingMachine(String product, double price) {
        this.product = product;
        this.price = price;
    }

    public double getChange() {
        if(product == "cola".toUpperCase()){
            return price - COLA;
        } else {
            return price;
        }
    }

    public String getProduct() {
        return product;
    }

    public double getPrice(){
        return price;
    }
}

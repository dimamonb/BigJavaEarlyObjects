package ch08.re04;

public class VendingMachineProduct {
    private String product;
    private double price;

    public VendingMachineProduct(String product, double price) {
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }
}

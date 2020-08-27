package org.cmbk.miu.cs525.labs.lab4.g;

public class Product extends ProductCatalogComponent {
    private final double price;

    public Product(String name, double price) {
        super(name);
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("--- product " + name + " price=" + getPrice());
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}

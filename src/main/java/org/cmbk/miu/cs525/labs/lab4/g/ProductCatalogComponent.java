package org.cmbk.miu.cs525.labs.lab4.g;

public abstract class ProductCatalogComponent {
    protected String name;

    public ProductCatalogComponent(String name) {
        this.name = name;
    }

    public abstract void print();

    public abstract double getPrice();
}

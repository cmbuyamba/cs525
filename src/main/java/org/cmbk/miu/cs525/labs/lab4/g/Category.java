package org.cmbk.miu.cs525.labs.lab4.g;

import java.util.Collection;
import java.util.HashSet;

public class Category extends ProductCatalogComponent {
    private Collection<ProductCatalogComponent> productCatalogComponent = new HashSet<>();

    public Category(String name) {
        super(name);
    }

    public void addComponent(ProductCatalogComponent component) {
        productCatalogComponent.add(component);
    }

    @Override
    public void print() {
        System.out.println("-- catalogue " + name + " price=" + getPrice());
        productCatalogComponent.forEach(ProductCatalogComponent::print);
    }

    @Override
    public double getPrice() {
        return productCatalogComponent.stream().mapToDouble(ProductCatalogComponent::getPrice).sum();
    }
}

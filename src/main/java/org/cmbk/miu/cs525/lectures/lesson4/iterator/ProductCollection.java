package org.cmbk.miu.cs525.lectures.lesson4.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductCollection {
    private final List<Product> products = new ArrayList<>();
    public void addProduct(Product product){
        products.add(product);
    }
    public Iterator<Product> reverseIterator(){
        return new ReverseIterator<Product>(products);
    }
}

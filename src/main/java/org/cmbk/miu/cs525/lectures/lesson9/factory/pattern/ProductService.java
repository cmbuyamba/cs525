package org.cmbk.miu.cs525.lectures.lesson9.factory.pattern;

import org.cmbk.miu.cs525.lectures.lesson9.factory.domain.Product;
import org.cmbk.miu.cs525.lectures.lesson9.factory.pattern.dao.ProductDAO;

public class ProductService {
    private ProductDAO productDAO;

    public ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public void save(Product product) {
        productDAO.save(product);
    }
}

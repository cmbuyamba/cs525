package org.cmbk.miu.cs525.lectures.lesson9.factory;

import org.cmbk.miu.cs525.lectures.lesson9.factory.dao.ProductDAO;
import org.cmbk.miu.cs525.lectures.lesson9.factory.domain.Product;

public class ProductService {
    ProductDAO productDAO;

    public ProductService() {
        productDAO = ProductDAOFactory.getProductDAOInstance();
    }

    public void save(Product product) {
        productDAO.save(product);
    }
}

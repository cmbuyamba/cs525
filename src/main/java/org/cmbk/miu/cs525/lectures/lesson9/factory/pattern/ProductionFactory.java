package org.cmbk.miu.cs525.lectures.lesson9.factory.pattern;

import org.cmbk.miu.cs525.lectures.lesson9.factory.pattern.dao.CustomerDAO;
import org.cmbk.miu.cs525.lectures.lesson9.factory.pattern.dao.CustomerDAOImpl;
import org.cmbk.miu.cs525.lectures.lesson9.factory.pattern.dao.ProductDAO;
import org.cmbk.miu.cs525.lectures.lesson9.factory.pattern.dao.ProductDAOImpl;

public class ProductionFactory implements MyFactory{
    @Override
    public CustomerDAO getCustomerDAO() {
        return new CustomerDAOImpl();
    }

    @Override
    public ProductDAO getProductDAO() {
        return new ProductDAOImpl();
    }
}

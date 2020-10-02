package org.cmbk.miu.cs525.lectures.lesson9.factory.pattern;

import org.cmbk.miu.cs525.lectures.lesson9.factory.pattern.dao.CustomerDAO;
import org.cmbk.miu.cs525.lectures.lesson9.factory.pattern.dao.ProductDAO;

public interface MyFactory {
    CustomerDAO getCustomerDAO();

    ProductDAO getProductDAO();
}

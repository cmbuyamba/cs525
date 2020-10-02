package org.cmbk.miu.cs525.lectures.lesson9.factory.pattern;

import org.cmbk.miu.cs525.lectures.lesson9.factory.pattern.dao.*;

public class MockFactory implements MyFactory{
    @Override
    public CustomerDAO getCustomerDAO() {
        return new MockCustomerDAOImpl();
    }

    @Override
    public ProductDAO getProductDAO() {
        return new MockProductDAOImpl();
    }
}

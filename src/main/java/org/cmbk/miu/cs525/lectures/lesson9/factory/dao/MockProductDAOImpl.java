package org.cmbk.miu.cs525.lectures.lesson9.factory.dao;

import org.cmbk.miu.cs525.lectures.lesson9.factory.domain.Product;

public class MockProductDAOImpl implements ProductDAO{
    public void save(Product product) {
        System.out.println("MockProductDAOImpl saves product");
    }
}

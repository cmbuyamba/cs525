package org.cmbk.miu.cs525.lectures.lesson9.factory.pattern.dao;

import org.cmbk.miu.cs525.lectures.lesson9.factory.domain.Customer;

public class MockCustomerDAOImpl implements CustomerDAO{
    @Override
    public void save(Customer customer) {
        System.out.println("MockCustomerDAOImpl saves customer");
    }
}

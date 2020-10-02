package org.cmbk.miu.cs525.lectures.lesson9.factory.pattern.dao;

import org.cmbk.miu.cs525.lectures.lesson9.factory.domain.Customer;

public interface CustomerDAO {
    void save(Customer customer);
}

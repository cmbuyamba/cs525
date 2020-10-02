package org.cmbk.miu.cs525.lectures.lesson9.factory.pattern.dao;

import org.cmbk.miu.cs525.lectures.lesson9.factory.domain.Product;

public interface ProductDAO {
    void save(Product product);
}

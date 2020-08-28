package org.cmbk.miu.cs525.lectures.lesson9.singleton;

public class ProductDAO {
    private Connection connection;

    public ProductDAO() {
        connection = ConnectionPool.getPool().getConnection();
    }

    public void save() {
        connection.open();
    }
}

package org.cmbk.miu.cs525.lectures.lesson9.singleton;

public class CustomerDAO {
    private Connection connection;

    public CustomerDAO() {
        connection = ConnectionPool.getPool().getConnection();
    }

    public void save() {
        connection.open();
    }
}

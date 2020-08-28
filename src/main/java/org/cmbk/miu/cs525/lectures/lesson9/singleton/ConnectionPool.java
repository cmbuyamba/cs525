package org.cmbk.miu.cs525.lectures.lesson9.singleton;

import java.io.Serializable;

public class ConnectionPool implements Serializable {
    private static ConnectionPool pool = new ConnectionPool();
    //this is a pool with only 1 connection
    private Connection connection = new Connection();

    private ConnectionPool() {
        // Prevent form the reflection api.
        if (pool != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public synchronized static ConnectionPool getPool() {
        //Double check locking pattern
        if (pool == null) // check for the first time
            synchronized (ConnectionPool.class) { // check for the second time
                if (pool == null) pool = new ConnectionPool();
            }
        return pool;
    }

    public Connection getConnection() {
        return connection;
    }

    protected Object readResolve(){
        return getPool();
    }
}

package org.cmbk.miu.cs525.lectures.lesson9.singleton;

import java.io.*;

public class SingletonSerializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ConnectionPool instance1 = ConnectionPool.getPool();
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"))) {
            out.writeObject(instance1);
            // deserialize from file to object
            ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
            ConnectionPool instance2 = (ConnectionPool) in.readObject();
            in.close();
            System.out.println("instance1 hashCode=" + instance1.hashCode());
            System.out.println("instance2 hashCode=" + instance2.hashCode());
        }
    }
}

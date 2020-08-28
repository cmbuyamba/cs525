package org.cmbk.miu.cs525.lectures.lesson9.singleton;

public class SingletonThreadSafeTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    System.out.println("Instance " + j + " hash:" + ConnectionPool.getPool().hashCode());
                }
            }).start();
        }
    }
}

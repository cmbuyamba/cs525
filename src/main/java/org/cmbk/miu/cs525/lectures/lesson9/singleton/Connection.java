package org.cmbk.miu.cs525.lectures.lesson9.singleton;

import java.io.Serializable;

public class Connection implements Serializable {
    public void open() {
        System.out.println("open connection to DB: " + this.hashCode());
    }
}

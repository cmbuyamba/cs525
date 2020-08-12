package org.cmbk.miu.cs525.labs.lab4.def;

public abstract class XMLComponent {
    protected String key;

    public XMLComponent(String key) {
        this.key = key;
    }

    public abstract void print();
}

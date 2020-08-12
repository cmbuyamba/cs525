package org.cmbk.miu.cs525.lectures.lesson4.composite;

public abstract class  FileSystemComponent {
    protected String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    public abstract void print();

    public abstract int getSizeInBytes();
}

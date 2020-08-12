package org.cmbk.miu.cs525.lectures.lesson4.composite;

import java.util.Collection;
import java.util.HashSet;

public class Directory extends FileSystemComponent {
    protected Collection<FileSystemComponent> fileSystemComponents = new HashSet<>();

    public Directory(String name) {
        super(name);
    }

    public void addComponent(FileSystemComponent component) {
        fileSystemComponents.add(component);
    }

    public int getSizeInBytes() {
        return fileSystemComponents.stream().mapToInt(FileSystemComponent::getSizeInBytes).sum();
    }

    public void print() {
        System.out.println("-- dir " + name + " size=" + getSizeInBytes() + " bytes");
        fileSystemComponents.forEach(FileSystemComponent::print);
    }
}
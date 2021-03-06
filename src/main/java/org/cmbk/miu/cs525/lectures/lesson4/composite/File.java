package org.cmbk.miu.cs525.lectures.lesson4.composite;

public class File extends FileSystemComponent {
    private final int sizeInBytes;

    public File(String name, int sizeInBytes) {
        super(name);
        this.sizeInBytes = sizeInBytes;
    }

    public int getSizeInBytes() {
        return sizeInBytes;
    }

    public void print() {
        System.out.println("--- file " + name + " size=" +
                getSizeInBytes() + " bytes");
    }
}

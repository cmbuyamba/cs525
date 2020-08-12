package org.cmbk.miu.cs525.labs.lab4.def;

public class XMLElement extends XMLComponent {
    private String value;

    public XMLElement(String key, String value) {
        super(key);
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("\t<" + key + ">" + value + "</" + key + ">");
    }
}

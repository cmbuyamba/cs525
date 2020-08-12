package org.cmbk.miu.cs525.labs.lab4.def;

import java.util.ArrayList;
import java.util.Collection;

public class XMLNode extends XMLComponent {
    protected Collection<XMLComponent> xmlComponents = new ArrayList<>();

    public XMLNode(String key) {
        super(key);
    }

    public void addComponent(XMLComponent component) {
        xmlComponents.add(component);
    }

    @Override
    public void print() {
        System.out.println("<" + key + ">");
        xmlComponents.forEach(XMLComponent::print);
        System.out.print("</" + key + ">");
    }
}

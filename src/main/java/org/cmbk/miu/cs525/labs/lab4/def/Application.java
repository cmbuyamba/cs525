package org.cmbk.miu.cs525.labs.lab4.def;

public class Application {


    public static void main(String[] args) {
        XMLNode root = new XMLNode("person");
        root.addComponent(new XMLElement("firstName","Celestin"));
        root.addComponent(new XMLElement("lastName","Mbuyamba"));
        root.print();
    }
}

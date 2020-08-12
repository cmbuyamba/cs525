package org.cmbk.miu.cs525.lectures.lesson4.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ApplicationExternalIterator {
    public static void main(String[] args) {
        List<String> alphabet = new ArrayList<>();
        alphabet.add("a");
        alphabet.add("b");
        alphabet.add("c");
        Iterator<String> iterator = alphabet.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("c"))
                iterator.remove();
        }
        iterator = alphabet.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toUpperCase());
        }
    }
}

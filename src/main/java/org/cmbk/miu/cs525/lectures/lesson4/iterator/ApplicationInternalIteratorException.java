package org.cmbk.miu.cs525.lectures.lesson4.iterator;

import java.util.ArrayList;
import java.util.List;

public class ApplicationInternalIteratorException {
    public static void main(String[] args) {
        List<String> alphabet = new ArrayList<>();
        alphabet.add("a");
        alphabet.add("b");
        alphabet.add("c");
        alphabet.forEach(l -> {
            if (l.equals("c")) alphabet.remove(l);
        });
        alphabet.forEach(l -> System.out.println(l.toUpperCase()));
    }
}

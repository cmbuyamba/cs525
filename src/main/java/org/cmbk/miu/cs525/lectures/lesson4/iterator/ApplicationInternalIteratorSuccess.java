package org.cmbk.miu.cs525.lectures.lesson4.iterator;

import java.util.ArrayList;
import java.util.List;

public class ApplicationInternalIteratorSuccess {
    public static void main(String[] args) {
        List<String> alphabet = new ArrayList<>();
        alphabet.add("a");
        alphabet.add("b");
        alphabet.add("c");
        alphabet.removeIf(l -> l.equals("c"));
        alphabet.forEach(l -> System.out.println(l.toUpperCase()));
    }
}

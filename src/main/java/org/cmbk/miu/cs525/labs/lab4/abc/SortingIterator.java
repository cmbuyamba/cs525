package org.cmbk.miu.cs525.labs.lab4.abc;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SortingIterator<T> implements Iterator<T> {
    private final List<T> elements;
    private int position;

    public SortingIterator(List<T> elements, Comparator<T> comparator) {
        this.elements = elements;
        Collections.sort(elements, comparator);
    }

    @Override
    public boolean hasNext() {
        return position < elements.size();
    }

    @Override
    public T next() {
        return this.elements.get(position++);
    }
}

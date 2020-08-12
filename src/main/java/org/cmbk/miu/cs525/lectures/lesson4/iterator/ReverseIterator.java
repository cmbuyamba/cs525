package org.cmbk.miu.cs525.lectures.lesson4.iterator;

import java.util.Iterator;
import java.util.List;

public class ReverseIterator<E> implements Iterator<E> {
    private List<E> list;
    private int position;

    public ReverseIterator(List<E> list) {
        this.list = list;
        this.position = this.list.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return position >= 0;
    }

    @Override
    public E next() {
        return list.get(position--);
    }
}

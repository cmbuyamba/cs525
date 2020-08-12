package org.cmbk.miu.cs525.labs.lab4.abc;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class FilterIterator<T> implements Iterator<T> {

    private List<T> list;
    private int position;
    private Predicate<T> predicate;
    private boolean skip;

    public FilterIterator(List<T> list, Predicate<T> predicate, boolean skip) {
        this.list = list;
        this.predicate = predicate;
        this.skip = skip;
    }

    @Override
    public boolean hasNext() {
        if (predicate != null) {
            int tmpPos = position;
            while (tmpPos < list.size()) {
                if (predicate.test(list.get(tmpPos))) return true;
                else tmpPos++;
            }
        } else if (skip) return this.position < this.list.size();
        return false;
    }

    @Override
    public T next() {
        if (predicate != null) {
            int tmpPos = position;
            while (tmpPos < list.size()) {
                T t = list.get(tmpPos);
                if (predicate.test(t)) {
                    position = ++tmpPos;
                    return t;
                } else tmpPos++;
            }
        } else if (skip) {
            T t = this.list.get(position);
            position = position + 2;
            return t;
        }

        return null;
    }

    public int getPosition() {
        return position;
    }
}

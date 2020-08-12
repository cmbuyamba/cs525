package org.cmbk.miu.cs525.labs.lab4.abc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class CustomerCollection {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Iterator<Customer> sortingIterator(Comparator<Customer> comparator) {
        return new SortingIterator<>(this.customers, comparator);
    }

    public Iterator<Customer> filterIterator(Predicate<Customer> predicate, boolean skip) {
        return new FilterIterator<>(this.customers, predicate, skip);
    }
}

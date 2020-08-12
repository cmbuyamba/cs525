package org.cmbk.miu.cs525.labs.lab4.abc;

import java.util.Comparator;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {
        CustomerCollection customerCollection = new CustomerCollection();
        Address mbuyamba = new Address("15708 Woodland Dr", "Dearborn", 48120, "MI");
        Address nkelenda = new Address("5961 143rd Ln NW Ramsey", "Ramsey", 55303, "MN");
        customerCollection.addCustomer(new Customer("Kyria", "Mbuyamba", 2, mbuyamba));
        customerCollection.addCustomer(new Customer("Celestin", "Mbuyamba", 40, mbuyamba));
        customerCollection.addCustomer(new Customer("Mael", "Mbuyamba", 5, mbuyamba));
        customerCollection.addCustomer(new Customer("Rachel", "Bilonda", 37, mbuyamba));
        customerCollection.addCustomer(new Customer("Jourdan", "Mbuyamba", 8, mbuyamba));

        customerCollection.addCustomer(new Customer("Joseph", "Nkelenda", 48, nkelenda));
        customerCollection.addCustomer(new Customer("Giselle", "Nkelenda", 44, nkelenda));
        customerCollection.addCustomer(new Customer("Mercia", "Nkelenda", 9, nkelenda));
        customerCollection.addCustomer(new Customer("Gracia", "Nkelenda", 9, nkelenda));
        customerCollection.addCustomer(new Customer("Camile", "Nkelenda", 11, nkelenda));
        customerCollection.addCustomer(new Customer("Joric", "Nkelenda", 14, nkelenda));

        // Part a
        System.out.println("---------------------- Sorting customers ----------------------");
        Iterator<Customer> sortingIterator = customerCollection.sortingIterator(Comparator.comparingInt(Customer::getAge));
        while (sortingIterator.hasNext()) {
            System.out.println(sortingIterator.next());
        }

        //Part b.1
        System.out.println("---------------------- Filtering customers by city----------------------");
        Iterator<Customer> filterIterator = customerCollection.filterIterator(customer -> customer.getAddress().getCity().equals("Dearborn"), false);
        while (filterIterator.hasNext()) {
            System.out.println(filterIterator.next());
        }

        //Part b.2
        System.out.println("---------------------- Filtering customers by zip code----------------------");
        filterIterator = customerCollection.filterIterator(customer -> (customer.getAddress().getZipCode() +"").startsWith("55"), false);
        while (filterIterator.hasNext()) {
            System.out.println(filterIterator.next());
        }

        //Part c
        System.out.println("---------------------- Filtering customers with skip ----------------------");
        filterIterator = customerCollection.filterIterator(null, true);
        while (filterIterator.hasNext()) {
            System.out.println(((FilterIterator)filterIterator).getPosition() + " >> " + filterIterator.next());
        }
    }
}

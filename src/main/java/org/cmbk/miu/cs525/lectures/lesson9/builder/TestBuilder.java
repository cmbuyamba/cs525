package org.cmbk.miu.cs525.lectures.lesson9.builder;

public class TestBuilder {
    public static void main(String[] args) {
        Customer customer = Customer.newCustomer()
                .isMarried()
                .withAge(40)
                .withFirstName("Celestin")
                .withPhone("3475530909")
                .withLastname("Mbuyamba")
                .withNumberOfChildren(3)
                .withYearlyIncome(500)
                .isNotMarried()
                .build();
        System.out.println(customer);
    }
}

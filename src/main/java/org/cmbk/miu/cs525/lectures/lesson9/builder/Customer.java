package org.cmbk.miu.cs525.lectures.lesson9.builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Customer {
    private String firstName;
    private String lastname;
    private String phone;
    private String email;
    private int age;
    private int numberOfChildren;
    private int shoeSize;
    private boolean isMarried;
    private double yearlyIncome;
    private double yearlyAmountSpendOnShoes;

    public static Builder newCustomer() {
        return new Builder();
    }

    static class Builder {
        private String firstName;
        private String lastname;
        private String phone;
        private String email;
        private int age;
        private int numberOfChildren;
        private int shoeSize;
        private boolean isMarried;
        private double yearlyIncome;
        private double yearlyAmountSpendOnShoes;

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withNumberOfChildren(int numberOfChildren) {
            this.numberOfChildren = numberOfChildren;
            return this;
        }

        public Builder withShoeSize(int shoeSize) {
            this.shoeSize = shoeSize;
            return this;
        }

        public Builder isMarried() {
            this.isMarried = true;
            return this;
        }

        public Builder isNotMarried() {
            this.isMarried = false;
            return this;
        }

        public Builder withYearlyIncome(double yearlyIncome) {
            this.yearlyIncome = yearlyIncome;
            return this;
        }

        public Builder withYearlyAmountSpendOnShoes(double yearlyAmountSpendOnShoes) {
            this.yearlyAmountSpendOnShoes = yearlyAmountSpendOnShoes;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    public Customer(Builder builder) {
        this.firstName = builder.firstName;
        this.lastname = builder.lastname;
        this.phone = builder.phone;
        this.email = builder.email;
        this.age = builder.age;
        this.numberOfChildren = builder.numberOfChildren;
        this.shoeSize = builder.shoeSize;
        this.isMarried = builder.isMarried;
        this.yearlyIncome = builder.yearlyIncome;
        this.yearlyAmountSpendOnShoes = builder.yearlyAmountSpendOnShoes;
    }
}

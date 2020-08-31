package org.cmbk.miu.cs525.lectures.lesson9.factory;

public class Application {
    public static void main(String[] args) {
        CreditCardFactory.getCreditCardInstance("visa", "123456789", 5000, 10);
        RandomIntGenerator between = RandomIntGenerator.between(40, 100);
        RandomIntGenerator smallerThan = RandomIntGenerator.smallerThan(50);
        RandomIntGenerator biggerThan = RandomIntGenerator.biggerThan(50);
        System.out.println("between: " + between.next());
        System.out.println("smallerThan: " + smallerThan.next());
        System.out.println("biggerThan: " + biggerThan.next());
    }
}

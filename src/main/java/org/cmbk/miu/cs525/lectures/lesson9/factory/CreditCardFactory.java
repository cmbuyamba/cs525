package org.cmbk.miu.cs525.lectures.lesson9.factory;

public class CreditCardFactory {
    public static CreditCard getCreditCardInstance(String type,
                                            String number,
                                            double limit,
                                            double annualCharge) {
        return new CreditCard(type, number, limit, annualCharge);
    }
}

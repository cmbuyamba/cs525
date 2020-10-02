package org.cmbk.miu.cs525.lectures.lesson9.factory.phone;

public class Application {
    public static void main(String[] args) {
        PhoneService phoneService = new PhoneService();
        phoneService.setPhoneFactory(new IPhoneFactory());
        System.out.println(phoneService.getPhone().getName());
        phoneService.setPhoneFactory(new SamsungFactory());
        System.out.println(phoneService.getPhone().getName());
    }
}
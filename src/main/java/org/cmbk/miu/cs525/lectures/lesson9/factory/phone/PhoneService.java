package org.cmbk.miu.cs525.lectures.lesson9.factory.phone;

public class PhoneService {
    private PhoneFactory phoneFactory;

    public void setPhoneFactory(PhoneFactory phoneFactory) {
        this.phoneFactory = phoneFactory;
    }

    public Phone getPhone() {
        return phoneFactory.getPhone();
    }
}
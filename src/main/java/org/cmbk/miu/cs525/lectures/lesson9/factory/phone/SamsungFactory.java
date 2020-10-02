package org.cmbk.miu.cs525.lectures.lesson9.factory.phone;

public class SamsungFactory implements PhoneFactory {
    @Override
    public Phone getPhone() {
        return new Samsung();
    }
}
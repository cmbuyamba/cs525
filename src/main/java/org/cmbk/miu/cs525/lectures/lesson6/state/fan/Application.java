package org.cmbk.miu.cs525.lectures.lesson6.state.fan;

public class Application {
    public static void main(String[] args) {
        CeilingFan fan = new CeilingFan();
        fan.setState(new Off(fan, true));
        fan.pullGreen();
        fan.pullGreen();
        fan.pullRed();
        fan.pullRed();
    }
}

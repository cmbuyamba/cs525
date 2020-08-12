package org.cmbk.miu.cs525.lectures.lesson6.state.fan;

public class CeilingFan {
    private FanState state;

    public void setState(FanState state) {
        this.state = state;
    }

    public void pullRed() {
        state.pullRed();
    }

    public void pullGreen() {
        state.pullGreen();
    }
}

package org.cmbk.miu.cs525.lectures.lesson6.state;

public abstract class FanState {
    protected CeilingFan ceilingFan;

    public FanState(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public abstract void pullRed();

    public abstract void pullGreen();
}

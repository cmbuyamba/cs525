package org.cmbk.miu.cs525.lectures.lesson6.state;

public class High extends FanState {
    public High(CeilingFan ceilingFan) {
        super(ceilingFan);
        System.out.println("High speed");
    }

    @Override
    public void pullRed() {
        FanState newState = new Medium(ceilingFan);
        ceilingFan.setState(newState);
    }

    @Override
    public void pullGreen() {
        FanState newState = new Off(ceilingFan, false);
        ceilingFan.setState(newState);
    }
}

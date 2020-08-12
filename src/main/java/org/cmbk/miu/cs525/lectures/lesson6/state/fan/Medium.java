package org.cmbk.miu.cs525.lectures.lesson6.state.fan;

public class Medium extends FanState{
    public Medium(CeilingFan ceilingFan) {
        super(ceilingFan);
        System.out.println( "Medium speed" );
    }

    @Override
    public void pullRed() {
        FanState newState = new Low(ceilingFan);
        ceilingFan.setState(newState);
    }

    @Override
    public void pullGreen() {
        FanState newState = new High(ceilingFan);
        ceilingFan.setState(newState);
    }
}

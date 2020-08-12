package org.cmbk.miu.cs525.lectures.lesson6.state;

public class Low extends FanState{
    public Low(CeilingFan ceilingFan) {
        super(ceilingFan);
        System.out.println( "Low speed" );
    }

    @Override
    public void pullRed() {
        FanState newState = new Off(ceilingFan, false);
        ceilingFan.setState(newState);
    }

    @Override
    public void pullGreen() {
        FanState newState = new Medium(ceilingFan);
        ceilingFan.setState(newState);
    }
}

package org.cmbk.miu.cs525.lectures.lesson6.state;

public class Off extends FanState {
    public Off(CeilingFan ceilingFan, boolean start) {
        super(ceilingFan);
        if(!start){
            System.out.println("Turning off");
        }
    }

    @Override
    public void pullRed() {
        FanState newState = new High(ceilingFan);
        ceilingFan.setState(newState);
    }

    @Override
    public void pullGreen() {
        FanState newState = new Low(ceilingFan);
        ceilingFan.setState(newState);
    }
}

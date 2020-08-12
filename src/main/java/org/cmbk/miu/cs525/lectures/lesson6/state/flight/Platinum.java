package org.cmbk.miu.cs525.lectures.lesson6.state.flight;

public class Platinum extends AccountState{
    public Platinum(FFAccount ffAccount) {
        super(ffAccount);
    }

    @Override
    public String getAccountType() {
        return "Platinum";
    }

    @Override
    public void addFlight(int newMiles) {
        ffAccount.addNrOfMiles(3 * newMiles);
        ffAccount.setNrOfFlights(ffAccount.getNrOfFlights() + 1);
    }

    @Override
    public void checkForUpgrade() {

    }
}

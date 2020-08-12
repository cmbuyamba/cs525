package org.cmbk.miu.cs525.lectures.lesson6.state.flight;

public class Silver extends AccountState {
    public Silver(FFAccount ffAccount) {
        super(ffAccount);
    }

    @Override
    public String getAccountType() {
        return "Silver";
    }

    @Override
    public void addFlight(int newMiles) {
        ffAccount.addNrOfMiles(newMiles);
        ffAccount.setNrOfFlights(ffAccount.getNrOfFlights() + 1);
        checkForUpgrade();
    }

    @Override
    public void checkForUpgrade() {
        if ((ffAccount.getNrOfMiles() > 100000) || (ffAccount.getNrOfFlights() > 95)) {
            AccountState newState = new Gold(ffAccount);
            ffAccount.setAccountState(newState);
            ffAccount.addNrOfMiles(5000);
        }
    }
}

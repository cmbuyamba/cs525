package org.cmbk.miu.cs525.lectures.lesson6.state.flight;

public class Gold extends AccountState {
    public Gold(FFAccount ffAccount) {
        super(ffAccount);
    }

    @Override
    public String getAccountType() {
        return "Gold";
    }

    @Override
    public void addFlight(int newMiles) {
        ffAccount.addNrOfMiles(2 * newMiles);
        ffAccount.setNrOfFlights(ffAccount.getNrOfFlights() + 1);
        checkForUpgrade();
    }

    @Override
    public void checkForUpgrade() {
        if ((ffAccount.getNrOfMiles() > 150000) || (ffAccount.getNrOfFlights() > 145)) {
            AccountState newState = new Platinum(ffAccount);
            ffAccount.setAccountState(newState);
            ffAccount.addNrOfMiles(10000);
        }
    }
}

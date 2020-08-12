package org.cmbk.miu.cs525.lectures.lesson6.state.flight;

import lombok.Data;

@Data
public class FFAccount {
    private String accountNumber;
    private int nrOfMiles;
    private int nrOfFlights;
    private AccountState accountState;

    public FFAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountState.getAccountType();
    }

    public void addFlight(int newMiles) {
        accountState.addFlight(newMiles);
    }

    public void addNrOfMiles(int newMiles) {
        this.nrOfMiles += newMiles;
    }
}

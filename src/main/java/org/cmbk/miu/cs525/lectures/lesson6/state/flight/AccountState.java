package org.cmbk.miu.cs525.lectures.lesson6.state.flight;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class AccountState {
    protected FFAccount ffAccount;

    public abstract String getAccountType();

    public abstract void addFlight(int newMiles);

    public abstract void checkForUpgrade();
}

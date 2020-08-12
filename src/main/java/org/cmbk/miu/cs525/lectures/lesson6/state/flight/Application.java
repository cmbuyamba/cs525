package org.cmbk.miu.cs525.lectures.lesson6.state.flight;

public class Application {
    public static void main(String[] args) {
        FFAccount ffaccount = new FFAccount("213425");
        AccountState accountState = new Silver(ffaccount);
        ffaccount.setAccountState(accountState);
        ffaccount.addFlight(13000);
        System.out.println("Account nr ="+ffaccount.getAccountNumber());
        System.out.println("Account type ="+ffaccount.getAccountType());
        System.out.println("miles ="+ffaccount.getNrOfMiles());
        ffaccount.addFlight(99000);
        System.out.println("Account nr ="+ffaccount.getAccountNumber());
        System.out.println("Account type ="+ffaccount.getAccountType());
        System.out.println("miles ="+ffaccount.getNrOfMiles());
    }
}

package org.cmbk.miu.cs525.lectures.lesson11;

import org.cmbk.miu.cs525.lectures.lesson11.annotation.Inject;
import org.cmbk.miu.cs525.lectures.lesson11.bank.BankService;
import org.cmbk.miu.cs525.lectures.lesson11.framework.FWApplication;

public class Application implements Runnable {

    @Inject
    private BankService bankService;

    public static void main(String[] args) {
        FWApplication.run(Application.class);
    }

    @Override
    public void run() {
        bankService.deposit(200000);
    }
}
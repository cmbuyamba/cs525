package org.cmbk.miu.cs525.labs.lab5.bank.service.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cmbk.miu.cs525.labs.lab5.bank.service.IAccountService;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepositCommand implements Command {
    private double amount;
    private IAccountService accountService;
    private long accountNumber;

    @Override
    public void execute() {
        accountService.deposit(accountNumber, amount);
    }

    @Override
    public void unExecute() {
        accountService.withdraw(accountNumber, amount);
    }
}

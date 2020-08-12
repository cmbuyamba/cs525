package org.cmbk.miu.cs525.labs.lab5.bank.service.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cmbk.miu.cs525.labs.lab5.bank.service.IAccountService;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferFundsCommand implements Command {

    private long fromAccountNumber;
    private long toAccountNumber;
    private double amount;
    private String description;
    private IAccountService accountService;

    @Override
    public void execute() {
        accountService.transferFunds(fromAccountNumber, toAccountNumber, amount, description);
    }

    @Override
    public void unExecute() {
        accountService.transferFunds(toAccountNumber, fromAccountNumber, amount, description);
    }
}

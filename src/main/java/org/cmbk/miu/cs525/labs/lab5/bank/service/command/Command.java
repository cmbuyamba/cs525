package org.cmbk.miu.cs525.labs.lab5.bank.service.command;

public interface Command {
    void execute();
    void unExecute();
}

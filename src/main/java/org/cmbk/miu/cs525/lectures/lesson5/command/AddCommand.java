package org.cmbk.miu.cs525.lectures.lesson5.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddCommand implements Command {
    private Calculator calculator;
    private int value;

    @Override
    public void execute() {
        calculator.add(this.value);
    }

    @Override
    public void unExecute() {
        calculator.subtract(this.value);
    }
}

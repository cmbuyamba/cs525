package org.cmbk.miu.cs525.lectures.lesson5.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PopCommand implements Command{
    private Stack stack;
    private int i;
    @Override
    public void execute() {
        stack.pop();
    }

    @Override
    public void unExecute() {
        stack.push(this.i);
    }
}

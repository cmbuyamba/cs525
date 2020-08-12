package org.cmbk.miu.cs525.lectures.lesson5.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PushCommand implements Command {

    private Stack stack;
    private int i;

    @Override
    public void execute() {
        stack.push(this.i);
    }

    @Override
    public void unExecute() {
        stack.pop();
    }
}

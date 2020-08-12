package org.cmbk.miu.cs525.lectures.lesson5;

import org.cmbk.miu.cs525.lectures.lesson5.command.Calculator;
import org.cmbk.miu.cs525.lectures.lesson5.command.*;

import java.util.ArrayList;
import java.util.Collection;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Collection<Command> commands = new ArrayList<>();

        Command add = new AddCommand(calculator, 10);
        add.execute();
        commands.add(add);
        System.out.println("calculator = " + calculator);

        Command subtract = new SubtractCommand(calculator, 2);
        subtract.execute();
        commands.add(subtract);
        System.out.println("calculator = " + calculator);

        commands.forEach(Command::execute);

        Command subtract2 = new SubtractCommand(calculator, 16);
        subtract2.execute();
        commands.add(subtract2);
        System.out.println("calculator = " + calculator);

        commands.forEach(System.out::println);

        Stack stack = new Stack();
        Command popCommand = new PopCommand(stack, 10);
        Command pushCommand = new PushCommand(stack, 2);
        Invoker invoker = new Invoker();
        invoker.addCommand("popCommand", popCommand);
        invoker.addCommand("pushCommand", pushCommand);
        invoker.invoke("pushCommand");
        System.out.println("stack = " + stack);
    }
}

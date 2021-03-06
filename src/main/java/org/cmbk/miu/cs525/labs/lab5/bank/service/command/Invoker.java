package org.cmbk.miu.cs525.labs.lab5.bank.service.command;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Invoker {
    private final Map<String, Command> toDoCommands = new LinkedHashMap<>();
    private final LinkedList<Command> commandList = new LinkedList<>();
    private final LinkedList<Command> undoList = new LinkedList<>();

    public void addCommand(String cmdName, Command command) {
        toDoCommands.put(cmdName, command);
    }

    public void invoke(String commandName) {
        Command command = toDoCommands.get(commandName);
        if (command != null) {
            command.execute();
            commandList.add(command);
        }
    }

    public void undo() {
        Command command = commandList.removeLast();
        if (command != null) {
            command.unExecute();
            undoList.add(command);
        }
    }

    public void redo() {
        Command command = undoList.removeLast();
        if (command != null) {
            command.execute();
            commandList.add(command);
        }
    }
}

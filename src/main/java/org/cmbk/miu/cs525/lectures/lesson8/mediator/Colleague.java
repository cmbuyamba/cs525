package org.cmbk.miu.cs525.lectures.lesson8.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Colleague {
    protected String name;
    protected Mediator mediator;

    public abstract void receiveMessage(Message message);

    public abstract void sendMessage(Message message);
}

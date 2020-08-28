package org.cmbk.miu.cs525.lectures.lesson8.mediator;

import java.util.HashMap;
import java.util.Map;

public abstract class Mediator {
    protected Map<String, Colleague> colleagues = new HashMap<>();

    public abstract void transferMessage(Message message);

    public void addColleague(Colleague colleague) {
        colleagues.put(colleague.getName(), colleague);
    }
}

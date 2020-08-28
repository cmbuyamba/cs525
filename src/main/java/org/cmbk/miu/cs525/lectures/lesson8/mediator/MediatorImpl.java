package org.cmbk.miu.cs525.lectures.lesson8.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl extends Mediator {
    private List<Message> conversations = new ArrayList<>();

    @Override
    public void transferMessage(Message message) {
        System.out.println("--------- Start Mediator ----------");
        System.out.println("Message recording");
        conversations.add(message);
        System.out.println("Message transmission");
        System.out.println("From :" + message.getSender());
        System.out.println("To:" + message.getReceiver());
        Colleague receiver = colleagues.get(message.getReceiver());
        receiver.receiveMessage(message);
        System.out.println("--------- End Mediator ----------");
    }

    public void analyzeConversation() {
        for (Message message : conversations) System.out.println(message.toString());
    }
}

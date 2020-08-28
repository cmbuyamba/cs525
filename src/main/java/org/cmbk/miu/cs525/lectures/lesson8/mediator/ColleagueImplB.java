package org.cmbk.miu.cs525.lectures.lesson8.mediator;

public class ColleagueImplB extends Colleague {

    public ColleagueImplB(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void receiveMessage(Message message) {
        System.out.println("Colleague name: " + name + ", Receiving the message");
        System.out.println("From: " + message.getSender());
        System.out.println("Content: " + message.getContent());
        System.out.println("Message processing by ....." + this.name);
    }

    @Override
    public void sendMessage(Message message) {
        System.out.println("Colleague name: " + name + ", Send message");
        message.setSender(this.name);
        mediator.transferMessage(message);
    }
}

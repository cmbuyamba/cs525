package org.cmbk.miu.cs525.lectures.lesson8.mediator;

public class Application {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();
        Colleague colleague1 = new ColleagueImplA("C1", mediator);
        Colleague colleague2 = new ColleagueImplA("C2", mediator);
        Colleague colleague3 = new ColleagueImplB("C3", mediator);
        mediator.addColleague(colleague1);
        mediator.addColleague(colleague2);
        mediator.addColleague(colleague3);
        colleague1.sendMessage(new Message("I am 20 m away", "C2"));
        colleague1.sendMessage(new Message("I am 30 m away", "C3"));
    }
}

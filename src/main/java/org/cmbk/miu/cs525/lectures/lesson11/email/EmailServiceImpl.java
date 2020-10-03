package org.cmbk.miu.cs525.lectures.lesson11.email;

import org.cmbk.miu.cs525.lectures.lesson11.annotation.Inject;
import org.cmbk.miu.cs525.lectures.lesson11.annotation.Service;

@Service
public class EmailServiceImpl implements EmailService {
    @Inject(value="message")
    private String from;
    public void send(String emailAddress, String message) {
        System.out.println("sending email to " + emailAddress + " , message=" + message + ", from=" + from);
    }
}
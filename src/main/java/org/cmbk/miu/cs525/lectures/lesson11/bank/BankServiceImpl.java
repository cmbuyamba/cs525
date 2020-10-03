package org.cmbk.miu.cs525.lectures.lesson11.bank;

import org.cmbk.miu.cs525.lectures.lesson11.annotation.Inject;
import org.cmbk.miu.cs525.lectures.lesson11.annotation.Service;
import org.cmbk.miu.cs525.lectures.lesson11.email.EmailService;

@Service
public class BankServiceImpl implements BankService {
    @Inject
    private EmailService emailService;
    @Inject("bank.name")
    private String bankName;

    public void setEmailSender(EmailService emailService) {
        this.emailService = emailService;
    }

    public void deposit(double amount) {
        emailService.send("celembuyamba@gmail.com", "deposit of $" + amount + " to " + bankName);
    }
}

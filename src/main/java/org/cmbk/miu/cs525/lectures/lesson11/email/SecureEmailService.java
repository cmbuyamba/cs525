package org.cmbk.miu.cs525.lectures.lesson11.email;

import org.cmbk.miu.cs525.lectures.lesson11.annotation.Inject;

public class SecureEmailService {
    @Inject(value="message")
    private String from;
    EmailSecurityChecker emailSecurityChecker = new EmailSecurityChecker();
    EmailService emailService;
    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }
    public void sendSecureEmail(String emailAddress, String message) {
        if (emailSecurityChecker.isEmailSecure(emailAddress, message)) {
            emailService.send(emailAddress, message);
        }
    }
}

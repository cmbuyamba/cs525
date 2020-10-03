package org.cmbk.miu.cs525.lectures.lesson11.email;

import org.cmbk.miu.cs525.lectures.lesson11.annotation.Inject;

public class EmailSecurityChecker {

    public boolean isEmailSecure(String emailAddress, String message) {
        return emailAddress != null && message != null;
    }
}

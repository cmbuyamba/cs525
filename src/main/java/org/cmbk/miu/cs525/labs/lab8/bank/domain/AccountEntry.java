package org.cmbk.miu.cs525.labs.lab8.bank.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountEntry {
    private Date date;
    private double amount;
    private String description;
    private String fromAccountNumber;
    private String fromPersonName;
}

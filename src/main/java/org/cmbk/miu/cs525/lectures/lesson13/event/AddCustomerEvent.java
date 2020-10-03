package org.cmbk.miu.cs525.lectures.lesson13.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class AddCustomerEvent {
    private String message;
}

package org.cmbk.miu.cs525.lectures.lesson8.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
    private String content;
    private String sender;
    private String receiver;

    public Message(String content, String receiver) {
        this.content = content;
        this.receiver = receiver;
    }
}

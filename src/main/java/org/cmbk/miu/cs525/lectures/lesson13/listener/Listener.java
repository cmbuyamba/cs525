package org.cmbk.miu.cs525.lectures.lesson13.listener;

import org.cmbk.miu.cs525.lectures.lesson13.event.AddCustomerEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

@Service
@EnableAsync
public class Listener {
    @EventListener
    @Async
    public void onEvent(AddCustomerEvent event) {
        System.out.println("received event :" + event.getMessage());
    }
}

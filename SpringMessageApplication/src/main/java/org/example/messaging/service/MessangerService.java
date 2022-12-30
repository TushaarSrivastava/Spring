package org.example.messaging.service;

import org.springframework.stereotype.Component;

@Component
public class MessangerService implements MessageService{
    @Override
    public void send(String msg) {
        System.out.println("MessangerService is used to send msg "+msg);
    }
}

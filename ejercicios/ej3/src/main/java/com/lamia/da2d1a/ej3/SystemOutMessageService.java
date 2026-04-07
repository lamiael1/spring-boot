package com.lamia.da2d1a.ej3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SystemOutMessageService implements MessageService {
    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

}

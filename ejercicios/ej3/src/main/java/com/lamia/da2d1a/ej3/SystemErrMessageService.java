package com.lamia.da2d1a.ej3;

import org.springframework.stereotype.Component;

@Component
public class SystemErrMessageService implements MessageService {
   @Override
    public void showMessage(String message) {
        System.err.println(message);
    }

}

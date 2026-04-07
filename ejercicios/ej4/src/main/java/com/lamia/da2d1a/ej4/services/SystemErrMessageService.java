package com.lamia.da2d1a.ej4.services;

import org.springframework.stereotype.Component;

@Component
public class SystemErrMessageService  implements MessageService{

    @Override
    public void showMessage(String message) {
        System.err.println(message);

}}

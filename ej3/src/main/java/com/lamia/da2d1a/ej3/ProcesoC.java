package com.lamia.da2d1a.ej3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
@Order(3)
public class ProcesoC implements CommandLineRunner {

    private final MessageService messageService;

    public ProcesoC(@Qualifier("systemErrMessageService") MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) {
        messageService.showMessage("Ejecutando: " + this.getClass().getName());
    }
}


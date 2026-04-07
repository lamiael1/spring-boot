package com.lamia.da2d1a.ej3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class ProcesoB implements CommandLineRunner {

    private final MessageService messageService;

    public ProcesoB(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) {
        messageService.showMessage("Ejecutando: " + this.getClass().getName());
    }
}

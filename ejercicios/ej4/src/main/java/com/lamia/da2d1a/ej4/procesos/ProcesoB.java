package com.lamia.da2d1a.ej4.procesos;

import com.github.javafaker.Faker;
import com.lamia.da2d1a.ej4.services.MessageService;
import org.springframework.stereotype.Component;

@Component
public class ProcesoB implements Proceso {

    private final MessageService messageService;
    private final Faker faker;

    public ProcesoB(MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker = faker;
    }

    @Override
    public void ejecutar() {
        messageService.showMessage(getClass().getName());
      //  messageService.showMessage("Frase: " + faker.bigBangTheory().quote());
    }
}

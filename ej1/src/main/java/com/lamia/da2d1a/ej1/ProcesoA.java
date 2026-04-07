package com.lamia.da2d1a.ej1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ProcesoA implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("Ejecutando: " + this.getClass().getName());
    }
}

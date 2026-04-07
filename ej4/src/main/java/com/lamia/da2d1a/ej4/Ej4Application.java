package com.lamia.da2d1a.ej4;

import com.lamia.da2d1a.ej4.procesos.ProcesoA;
import com.lamia.da2d1a.ej4.procesos.ProcesoB;
import com.lamia.da2d1a.ej4.procesos.ProcesoC;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ej4Application implements CommandLineRunner {

    private final ProcesoA procesoA;
    private final ProcesoB procesoB;
    private final ProcesoC procesoC;

    public Ej4Application(ProcesoA procesoA, ProcesoB procesoB, ProcesoC procesoC) {
        this.procesoA = procesoA;
        this.procesoB = procesoB;
        this.procesoC = procesoC;
    }

    public static void main(String[] args) {
        SpringApplication.run(Ej4Application.class, args);
    }

    @Override
    public void run(String... args) {
        procesoA.ejecutar();
        procesoB.ejecutar();
        procesoC.ejecutar();
    }
}

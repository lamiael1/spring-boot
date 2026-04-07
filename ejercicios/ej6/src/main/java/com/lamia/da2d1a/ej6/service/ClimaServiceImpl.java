package com.lamia.da2d1a.ej6.service;

import com.lamia.da2d1a.ej6.model.PrediccionDia;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClimaServiceImpl implements ClimaService {
    private final Faker faker;

    public ClimaServiceImpl(Faker faker) {
        this.faker = faker;
    }

    @Override
    public List<PrediccionDia> obtenerSemana() {
        List<PrediccionDia> predicciones = new ArrayList<>();
        LocalDate hoy = LocalDate.now();

        for (int i = 0; i < 7; i++) {
            predicciones.add(new PrediccionDia(
                    hoy.plusDays(i),
                    faker.number().numberBetween(0, 101),
                    faker.number().numberBetween(0, 11),  // Mín: 0-10
                    faker.number().numberBetween(10, 21), // Máx: 10-20
                    faker.number().numberBetween(0, 6)    // UV: 0-5
            ));
        }
        return predicciones;
    }
}
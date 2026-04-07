package com.lamia.da2d1a.ej6.service;
import com.lamia.da2d1a.ej6.model.Persona;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;
import java.util.stream.IntStream;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    private final Faker faker;

    public PersonaServiceImpl(Faker faker) { // Inyección por constructor [cite: 30]
        this.faker = faker;
    }

    @Override
    public Persona findOne() {
        return new Persona(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.idNumber().valid(),
                faker.date().birthday().toLocalDateTime().toLocalDate()
        );
    }

    @Override
    public List<Persona> find(int count) {
        return IntStream.range(0, count).mapToObj(i -> findOne()).toList();
    }
}
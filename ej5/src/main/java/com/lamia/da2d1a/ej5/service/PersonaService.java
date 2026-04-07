package com.lamia.da2d1a.ej5.service;
import com.lamia.da2d1a.ej5.model.Persona;
import java.util.List;

public interface PersonaService {
    List<Persona> find(int count);
    Persona findOne();
}
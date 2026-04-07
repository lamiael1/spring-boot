package com.lamia.da2d1a.ej5.controller;
import com.lamia.da2d1a.ej5.service.PersonaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonaController {
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) { // Inyección [cite: 28]
        this.personaService = personaService;
    }

    @GetMapping("/personas")
    public String list(Model model) {
        model.addAttribute("personas", personaService.find(10));
        return "personas-listado";
    }

    @GetMapping("/personas/una")
    public String single(Model model) {
        model.addAttribute("persona", personaService.findOne());
        return "persona-detalle";
    }
}
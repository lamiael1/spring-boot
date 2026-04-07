package com.lamia.da2d1a.ej6.controller;

import com.lamia.da2d1a.ej6.service.ClimaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrediccionController {
    private final ClimaService climaService;

    public PrediccionController(ClimaService climaService) {
        this.climaService = climaService;
    }

    @GetMapping("/prediccion")
    public String verPrediccion(Model model) {
        model.addAttribute("semana", climaService.obtenerSemana());
        return "prediccion";
    }
}
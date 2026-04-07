package com.lamia.da2d1a.ej6.model;

import java.time.LocalDate;

public record PrediccionDia(
        LocalDate fecha,
        int probPrecipitacion,
        int tempMin,
        int tempMax,
        int nivelUV
) {
    // Lógica para obtener la imagen según probabilidad P
    public String getImagenUrl() {
        if (probPrecipitacion < 25) return "https://www.aemet.es/imagenes/png/estado_cielo/11_g.png";
        if (25 <= probPrecipitacion && probPrecipitacion < 50) return "https://www.aemet.es/imagenes/png/estado_cielo/12_g.png";
        if (50 <= probPrecipitacion && probPrecipitacion < 75) return "https://www.aemet.es/imagenes/png/estado_cielo/14_g.png";
        return "https://www.aemet.es/imagenes/png/estado_cielo/25_g.png";
    }

    // Lógica para determinar la clase CSS del nivel UV
    public String getUvClass() {
        if (nivelUV <= 1) return "text-success"; // Verde
        if (nivelUV <= 3) return "text-warning"; // Naranja
        return "text-danger"; // Rojo
    }
}
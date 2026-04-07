package com.lamia.da2d1a.ej4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.github.javafaker.Faker;

@Configuration
public class BeansConfiguration {

    @Bean
    public Faker faker() {
        return new Faker();
    }
}

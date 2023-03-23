package com.example.zjazd_1_45c;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataConfiguration {
    @Bean
    public PlainOldJavaObject plainOldJavaObject() {
        return new PlainOldJavaObject();
    }

    @Bean
    public List<String> defaultData() {
        List<String> lista = new ArrayList<>();
        lista.add("Jeden");
        lista.add("Dwa");
        lista.add("Trzy");
        lista.add("Cztery");
        lista.add("Piec");

        return lista;
    }
}

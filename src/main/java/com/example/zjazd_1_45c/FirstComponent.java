package com.example.zjazd_1_45c;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FirstComponent {

    public FirstComponent(@Value("${my.custom.property:Hello from default value}") String valueFromProperties) {
        System.out.println("To jest FirstComponent");
        System.out.println(valueFromProperties);
    }

    public void print_message() {
        System.out.println("To jest FirstComponent print_message");
    }
}

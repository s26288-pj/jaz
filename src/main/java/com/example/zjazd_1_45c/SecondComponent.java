package com.example.zjazd_1_45c;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SecondComponent {

    public SecondComponent(FirstComponent firstComponent) {
        System.out.println("To jest SecondComponent");
    }

    public void print_message() {
        System.out.println("To jest SecondComponent print_message");
    }
}

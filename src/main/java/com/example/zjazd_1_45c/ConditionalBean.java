package com.example.zjazd_1_45c;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(
        value="power.on",
        havingValue = "true",
        matchIfMissing = true)
public class ConditionalBean {
    public ConditionalBean() {
        System.out.println("To jest Conditional Bean!");
    }
}

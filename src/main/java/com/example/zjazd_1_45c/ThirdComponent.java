package com.example.zjazd_1_45c;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ThirdComponent {

    public ThirdComponent(ApplicationContext applicationContext) {
        FirstComponent firstComponent = applicationContext.getBean("firstComponent", FirstComponent.class);
        SecondComponent secondComponent = applicationContext.getBean("secondComponent", SecondComponent.class);

        firstComponent.print_message();
        secondComponent.print_message();
    }
}

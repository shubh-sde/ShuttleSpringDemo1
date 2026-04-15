package com.backspring.spring_shuttle_demo1.config;

import com.backspring.spring_shuttle_demo1.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class PaymentServiceConfig {

    @Bean
    public PaymentService paymentService(){
        // Here any operations can be performed before object initialization and DI.
        return new PaymentService();
    }


}

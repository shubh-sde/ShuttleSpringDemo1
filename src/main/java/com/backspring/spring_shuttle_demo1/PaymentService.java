package com.backspring.spring_shuttle_demo1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class PaymentService {

    public void getAlertMessage(){
        System.out.println("Bean sample created..");
    }

    @PostConstruct
    public void afterInitialization(){
        System.out.println("Bean init but not shown yet.");
    }

    @PreDestroy
    public void beforeDestroy(){
        System.out.println("Bean just before destruction.");
    }
}

package com.backspring.spring_shuttle_demo1;

import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringShuttleDemo1Application implements CommandLineRunner {

    @Autowired
    PaymentService paymentServiceObj;

    public static void main(String[] args) {
        SpringApplication.run(SpringShuttleDemo1Application.class, args);
    }

    @Override
    public void run(String @NonNull ... args) {
        paymentServiceObj.getAlertMessage();
    }
}

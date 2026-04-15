package com.backspring.spring_shuttle_demo1;

import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SpringShuttleDemo1Application implements CommandLineRunner {

    // Field Di
    //@Autowired
    ///final NotificationService notificationService;

    // Constructor Di (Its auto wired by searching the component annotation)
    /*SpringShuttleDemo1Application(NotificationService notificationService){
        this.notificationService = notificationService;
    }*/

    /*SpringShuttleDemo1Application(@Qualifier("emailSMTP") NotificationService notificationService){
        this.notificationService = notificationService;
    }*/

    ///  Multi Di beans
    @Autowired
    Map<String, NotificationService> notificationServiceMap = new HashMap<>();

    public static void main(String[] args) {
        SpringApplication.run(SpringShuttleDemo1Application.class, args);
    }

    @Override
    public void run(String @NonNull ... args) {
        ///notificationService.sendNotification("send notification -- ");

        for (var notificationServiceMap: notificationServiceMap.entrySet()){
            System.out.println(notificationServiceMap.getKey());
            notificationServiceMap.getValue().sendNotification("Helloe ");
        }
    }
}

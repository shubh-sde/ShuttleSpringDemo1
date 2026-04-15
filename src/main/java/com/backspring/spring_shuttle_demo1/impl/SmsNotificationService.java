package com.backspring.spring_shuttle_demo1.impl;

import com.backspring.spring_shuttle_demo1.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 *  Below are the types of Di used to help spring framework
 *  to select appropriate bean if it has complete components
 */

//@Primary //(can we used to set the priority of the bean)
@Component
//@Qualifier("smsSMTP")
//@ConditionalOnProperty(name = "notification.type", havingValue = "sms") // Condition type defined in property
public class SmsNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS "+message);
    }
}

package com.upgrad.greeting;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) throws BeansException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.upgrad.greeting");
        EnglishGreetingService englishGreetingService1 = (EnglishGreetingService) context.getBean("englishGreetingService");
        EnglishGreetingService englishGreetingService2 = (EnglishGreetingService) context.getBean("englishGreetingService");
        System.out.println(englishGreetingService1 == englishGreetingService2);

        /*englishGreetingService.greet("Tushaar");
        System.out.println(englishGreetingService.getTimeService().getCurrentTime());*/
    }
}

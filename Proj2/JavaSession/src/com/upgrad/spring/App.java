package com.upgrad.spring;

public class App {

    public static void main(String[] args) {

        GreetingServiceFactory greetingServiceFactory = new GreetingServiceFactory();
        GreetingService greetingService = greetingServiceFactory.getGreetingService("french");
        greetingService.greet("Vishwa");
    }
}

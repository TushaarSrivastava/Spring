package com.upgrad.spring;

public class EnglishGreetingService implements GreetingService{
    @Override
    public void greet(String name){
        System.out.println("Hello, " + name);
    }
}

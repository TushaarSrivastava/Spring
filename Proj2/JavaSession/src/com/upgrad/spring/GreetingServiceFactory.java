package com.upgrad.spring;

public class GreetingServiceFactory {

    public GreetingService getGreetingService(String language){
        if (language.equals("english")){
            return new EnglishGreetingService();
        }else if(language.equals("french")){
            return new FrenchGreetingService();
        }else{
            throw new RuntimeException("No greeting service exists for " + language);
        }
    }
}

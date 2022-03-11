package guru.springframework.di.controllers;

/*
PROJECT NAME : dependency-injection
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 3/11/2022 7:03 PM
*/

import guru.springframework.di.services.GreetingService;


public class GetterInjectedController {

    private GreetingService greetingService;
    
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    String sayHello() {
        return greetingService.sayGreeting();
    }


}

package guru.springframework.di.services;

/*
PROJECT NAME : dependency-injection
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 3/11/2022 9:45 PM
*/

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}

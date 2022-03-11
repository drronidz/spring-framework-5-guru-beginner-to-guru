package guru.springframework.di.services;

/*
PROJECT NAME : dependency-injection
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 3/11/2022 11:02 PM
*/

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("fr")
public class PrimaryFrenchGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Service de salutation Primaire";
    }
}

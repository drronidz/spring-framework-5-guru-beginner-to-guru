package guru.springframework.di.services;

/*
PROJECT NAME : dependency-injection
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 3/11/2022 10:03 PM
*/

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario";
    }
}

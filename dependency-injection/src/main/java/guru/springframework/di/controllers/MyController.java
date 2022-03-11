package guru.springframework.di.controllers;

/*
PROJECT NAME : dependency-injection
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 3/11/2022 6:32 PM
*/

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String helloWorld() {
        System.out.println("Hello World from " + this.getClass().getSimpleName());
        return "Hello World from " + this.getClass().getSimpleName();
    }
}

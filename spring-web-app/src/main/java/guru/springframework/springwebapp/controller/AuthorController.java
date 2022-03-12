package guru.springframework.springwebapp.controller;

/*
PROJECT NAME : spring-web-app
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 3/10/2022 11:41 PM
*/

import guru.springframework.springwebapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors";
    }
}

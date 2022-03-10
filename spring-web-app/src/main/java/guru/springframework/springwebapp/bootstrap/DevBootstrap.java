package guru.springframework.springwebapp.bootstrap;

/*
PROJECT NAME : spring-web-app
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 3/10/2022 10:07 PM
*/

import guru.springframework.springwebapp.model.Author;
import guru.springframework.springwebapp.model.Book;
import guru.springframework.springwebapp.repositories.AuthorRepository;
import guru.springframework.springwebapp.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initDATA();
    }

    private void initDATA() {

        // Eric
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234","Harper Collins");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        // Jane
        Author jane = new Author("Jane", "Doe");
        Book noEJB = new Book("J2EE Development without EJB", "23444", "Worx");
        jane.getBooks().add(noEJB);

        authorRepository.save(jane);
        bookRepository.save(noEJB);

    }

}

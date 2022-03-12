package guru.springframework.springwebapp.repositories;

/*
PROJECT NAME : spring-web-app
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 3/10/2022 10:34 PM
*/

import guru.springframework.springwebapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}

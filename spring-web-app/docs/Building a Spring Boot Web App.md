# What is JPA?
* JPA stands for Java Persistence API.
* JPA is the official API for working with relational data in Java.
* JPA is only a specification.
   * JPA is not a concrete implementation.

# What does JPA do?
* JPA is a bridge from Java's object world to how data is stored
in relational databases.
* ORM : Object Relational Mapping.
* JPA offers Java developers database independence.
* One API will support many relational databases.

# JPA 2.0
* Java Community Process as JSR 317.
* Approved in December 2009.
* Added support for embedded objects and ordered lists.
* Added criteria query API.
* Added SQL Hints.
* Added Validation.

# JPA 2.1
* Java Community Process as JSR 338.
* Approved in December 2013.
* Added custom type converters.
* Criteria Update/Delete for bulk updates & deletes.
* Schema Generation.
* Queries against stored procedures.

# JPA 2.1
* Hibernate (72% of Market share)
* EclipseLink (13% of Market share)
* OpenJPA (2% of Market share)

# Databases Supported by Hibernate
* Oracle 11g
* DB2 9.7
* Microsoft SQL Server 2008.
* Sybase ASE 15.5
* MySQL 5.1, 5.5
* PostgreSQL 8.4, 9.1.
* Others: Apache Derby, Informix, MS Access, H2, Oracle 12c.

# Hibernate 5
* Hibernate 5 released in September 2015.
* Commercial support available from Red Hat.
* Adopted by Spring Framework in version 4.2 (July 2015).
* Adopted by Spring Boot version 1.4 (January 2016).

# Spring Data Repositories
* Provides an implementation of the Repository Pattern.
* Concept is originally from Eric Evan's book **Domain Driven Design**.
* A Repository has methods for retrieving domain objects should delegate to a 
specialized Repository object such that alternative storage implementations
may be interchanged.
* This is important, it allows you to easily substitute the persistence layer.
   * going from **SQL** to **NoSQL**.
   
# Spring DATA JPA
* Spring Data JPA is part of a larger family of Spring Data projects.
* Uses Hibernate for persistence to support **RDBS** systems.
  * Just about any major relational database.
* You extend a Java Repository Interface.
* Spring Data JPA provides the implementation at runtime.
* No SQL Required!

# Spring Controllers
* Annotate Controller Class with **@Controller**
  * This will register the class as a Spring Bean and as a Controller in **Spring MVC**.
* To map methods to http request paths use **@RequestedMapping**

# Introducing Thymeleaf
* Thymeleaf is a Java template engine.
* First stable release in July 2011.
* Rapidly gaining popularity in the **Spring Community**.
* Thymeleaf is a natural template engine.
   * Natural meaning you can view templates in your browser.
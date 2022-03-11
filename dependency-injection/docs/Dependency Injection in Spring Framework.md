# SOLID Principles of OOP

## History of SOLID Principals
* The SOLID principles date back to March of 1995.
* The principles are from Robert "Uncle Bob" Martin fowler.
* Started as writing, which ultimately were turned into the book **Agile Software Development : 
Principles, Patterns, and Practices.**
* Michael Feathers is credited with coming up with The SOLID Acronym.

## Why Use the SOLID Principles of OOP ?
* OOP is a powerful concept.
* But, OOP does not always lead to quality software.
* The 5 principles focus on dependency management.
* Poor dependency management leads to code that is brittle, fragile, and hard to change.
* Proper dependency management leads to quality code that is easy to maintain.

## S : Single Responsibility Principle :
* Every Class should have a single responsibility.
* There should never be more than one reason for a class to change.
* Your classes should be small. No more than a screen full of code.
* Avoid **God** classes.
   * 
* Split big classes into smaller classes.

## O: Open/Close Principle : 
* Your classes should be open for extension.
* But closed for modification.
* You should be able to extend a classes' behavior, without modifying it.
* Use private variables with **getters** & **setters** (Only when you need them).
* Use abstract base classes.

## Liskov Substitution Principle :
* By Barbara Liskov, in 1998.
* Objects in a program would be replaceable with instances of their subtypes Without altering 
the correctness of the program.
* Violations will often fail the "Is a " test.
* A Square "Is A " Rectangle.
* However, a Rectangle "Is Not" a Square.

## Interface Segregation Principle:
* Make fine-grained interfaces that are client specific.
* Many client specific interfaces are better than on "general purpose" interface.
* Keep your components focused and minimize dependencies between them.
* Notice relationship to the Single Responsibility Principle?
  * ie avoid "god" interfaces.

## Dependency Inversion Principle:
* Abstractions should not depend upon details.
* Details should depend upon abstractions.
* Important that higher level and lower level objects depend on the same abstract interaction.
* This is not the same as Dependency Injection : which is how objects obtain dependent objects.

## Summary
* The SOLID principles of OOP will lead you to a better quality code.
* Your code will be more testable and easier to maintain.
* A key theme is avoiding tight coupling in your code.

## Dependency Injection for 5 year :
When you go and get things out of the refrigerator for yourself, you can cause problems:
* You might leave the door open, 
* You might get something Mommy a& Daddy doesn't want you to have (a Bear for example).
* You might even be looking for something we don't even have.
* You might get something which has expired.

What you should be doing is starting a need like:
* I need something to drink with lunch.
Then, we will make sure you have something when you sit down to eat.

## Dependency Injection : 
* Dependency Injection is where a needed dependency is injected by another object.
* The class being injected has no responsibility in instantiating the object being injected.
* Some say you avoid declaring objects using 'new'
  * Not 100% correct ...

## Types of Dependency Injection : 
* By class properties : least preferred.
  * Using private properties is **Evil**.
* By Setters : Area of much debate.
* By Constructor : Most Preferred.

## Concrete Classes vs Interfaces :
* DI can be done with **Concrete Classes** or with **Classes**
* Generally **DI** with Concrete Classes should be avoided.
* DI via interfaces is highly preferred:
  * Allows runtime to decide implementation to inject.
  * Follow Interfaces Segregation Principle of **SOLID**.
  * Also, makes your code more testable.
  
## Inversion of Control 
* Inversion of Control : IoC
* Is a technique to allow dependencies to be injected at runtime.
* Dependencies are not predetermined.

## Inversion of Control
One important characteristic of a framework is that the methods defined by the user to tailor
the framework will often be called from within the framework itself, rather than from the user's
application code. The framework often plays the role of the main program in coordinating 
and sequencing application activity. This inversion of control gives framework the power to serve as 
extensible skeletons. The methods supplied by the user tailor the generic algorithms defined in the
framework for a particular application.

## IoC vs Dependency Injection:
* IoC and DI are easily confused.
* DI refers much to the composition of your classes.
  * ie : you compose your classes with DI in mind.
* IoC is the runtime environment of your code.
  * ie : Spring framework's IoC container.

# Spring Bean Life Cycle : 
* Instantiate:
  * 
* Populate properties.
* Call setBeanName of BeanNameAware.
* Call setBeanFactory of BeanFactoryAware.
* Call setApplicationContext of ApplicationContextAware.
* Pre-initialization (Bean PostProcessors).
* afterPropertiesSet of Initializing Beans.
* Custom Init Method.
* Post Initialization (BeanPostProcessors).
* **Bean Ready to use**.
* Container Shutdown.
* Disposable Bean's destroy().
* Call Custom Destroy Method.

## Callback Interfaces:
* Spring has two interfaces you can implement for call back events
* InitializingBean.afterPropertiesSet()
  * called after properties are set.
* DisposableBean.destroy()
  * Called during bean destruction in a shutdown.
  
## Life Cycle Annotations:
* Spring has two annotations you can use to hook into the bean life cylce:
  * **`@PostConstruct`** annotated methods will be called after the bean has been constructed,
  but before its returned to the requesting object.
  * **`@PreDestroy`** is called just before the bean is destroyed by the container.

## Bean Post Processors:
* Gives you a means to tap into the Spring context life cycle and interact with beans as they are
processed.
* Implement interface BeanPostProcessor
  * postProcessBeforeInitialization : Called before bean initialization method.
  * postProcessAfterInitialization : Called after bean initialization.
  
## Aware Interfaces
* Spring has over 'Aware' interfaces.
* These are used to access the Spring Framework infrastructure.
* These are largely used within the framework.
* Rarely used by Spring developers.  


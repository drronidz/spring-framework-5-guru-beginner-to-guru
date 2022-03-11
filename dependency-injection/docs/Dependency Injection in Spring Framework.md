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
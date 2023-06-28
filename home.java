Polymorphism

1.What does the word 'polymorphism' mean?

polymorphism means "many form" and it occur when we have many different class that related to eachother by inheritance.

2.What does it mean when we apply polymorphism to OO design? Give a simple Java example.

When we apply polymorphism to object-oriented design, it means that we can use a single interface or class type to represent multiple related types

3.What can we use to implement polymorphism in Java?

Inheritance, Interfaces and method overloading

4.How many 'forms' can an object take when using polymorphism?

Polymorphism in Java allows an object to take multiple forms, including its own class, superclass or interface type, and the Object class

5.Give an example of when you could use polymorphism.

In the context of cars, polymorphism can be demonstrated when you have different types of cars (e.g., Sedan, SUV, Convertible) that inherit from a common Car class. You can write code that operates on a Car object, and it can be used with any specific type of car without needing to know the exact subtype. This flexibility allows you to write generic car-related operations that can be applied to various car types seamlessly.

Composition and Aggregation

1.What do we mean by 'composition' in reference to object-oriented programming?
Composition in object-oriented programming refers to combining simpler objects to create more complex objects. It involves creating a class that holds references to other classes as member variables, allowing for code reuse and creating modular systems.

2.When would you use composition? Provide a simple example in Java.

Composition is used when you want to create complex objects by combining simpler objects. For example, let's consider a "Car" class that is composed of an "Engine" object and a "Wheel" object. The Car class uses composition to combine the Engine and Wheel objects to create a complete Car object.

3.Give a difference between composition and aggregation?

Composition: Strong relationship, contained objects are part of the containing object and have their lifecycle tightly coupled.
Aggregation: Weaker relationship, contained objects can exist independently and may be shared among multiple containing objects.

4.What is/are the advantage(s) of using composition/aggregation?

Using composition/aggregation in object-oriented programming offers advantages such as code reusability, flexibility, encapsulation, relationship modeling, performance optimisation, and improved maintainability and extensibility.

5.When using composition, when an object is destroyed, what happens to all the objects it is composed of?

When an object that uses composition is destroyed, all the objects it is composed of are also destroyed. The composed objects have a lifecycle tied to the lifecycle of the containing object, and they are created and destroyed along with it

6.When using aggregation, when an object is destroyed, what happens to all the objects it is composed of?


When an object that uses aggregation is destroyed, the objects it is composed of still exist independently. The composed objects have their own lifecycles and are not directly affected by the destruction of the containing object. They can be shared and used by other objects even after the containing object is destroyed.
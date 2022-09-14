# Java-Fundamentals
## Methods
### Introduction
Each methods have access modifiers. Methods can be static or non static. 
For method Name we can use camel case as the standard. 
Method signature is the method name along with its parameters. 
The reason that the access modifier not contain in the signature is due to overloading. 

### Parameter in Methods
Pass by value and Pass by reference are the methods that can be used for passing values to the method.

### 4 principles of OOP (Object Orented Programming)
#### Encapsulation
Wrapping the data and code acting on the data(methods) together as a single unit. 
The variables of a class will be hidden from other classes and can be accessed only through the methods of their current class. Therefore it is also known as data hiding. 
Getters and Setters are used.
#### Inheritance
One class acquires the properties (methods and fields) of another
Is a relationship
#### Plymorphism
Many forms, occurs when we have many classes that are related to each other by inheritance. 
Method overriding 
Method Overloading 
#### Abstraction
"The process of hinding certain details and showing only essential information to the users". 
Abstract Classes 
Abstract Methods 
Interfaces

#### Exception Handling
##### Exception 
Triggering an unwanted event in a program is called an exception. 
There are two types of exceptions. 
01. Checked Exception - Compile time exception
02. Unchecked Exception - Runtime exception 
There is a hierachy in exception handling
Super class of the exception class is Throwable 
Exception class have subclass called Runtime Exception (Arithmatic Exception, Nullpointer Exception, Number format exception, index out of bound(array, string))
Exceptions can handled but errors cannot. For example, stack overflow error, out of memory error and network failures are errors that cannot be handle.  


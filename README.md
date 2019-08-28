# Design-Patterns-Tutorial-Command
Command design pattern is a behavioral design pattern in which an object is used to represent and encapsulate all information needed to call a method at a later time. This information includes method name, the object that owns the method and values for method parameters.

This allows you to store lists of code that is executed at a later time or many times. Normally this comes with the ability to undo commands. If a program wants a specific command to run when a method is called on an encapsulated (hidden) object, then an object (called the invoker) will transfer this command to another object (receiver) to execute the correct code.

Command design benefits include: setting a list of commands for later use, storing multiple commands and procedures in a class to be executed, and even implement an undo procedure to undo previous commands! Its only real negative is the need for many classes that store commands.

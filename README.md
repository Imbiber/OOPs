# Library Management System

This project implements a simple Library Management System in Java. It allows users to manage books, patrons, borrowing, and returning within a library.

## Features

- **Borrowing Books**: Patrons can borrow available books from the library.
- **Returning Books**: Patrons can return borrowed books to the library.
- **Book and Patron Management**: Librarians can add new books and patrons to the library system.

## How to Use

1. **Compile the Code**: Compile the Java files using any Java compiler, or use an IDE like Eclipse or IntelliJ IDEA.
   
2. **Run the Main Class**: Execute the Main class to launch the Library Management System.

3. **Follow the Menu**: Use the menu options to borrow or return books as needed. Input required information as prompted.

## Code Structure

- **Book Class**: Represents a book in the library with properties such as ID, title, author, and availability status.
  
- **Patron Class**: Represents a patron (library user) with properties like ID and name.
  
- **Library Class**: Implements the library system functionalities including book and patron management, borrowing, and returning.

- **Main Class**: Contains the main method to run the library management system.

## Dependencies

This project has no external dependencies. It's built using core Java functionality.

## Future Improvements

- Enhance user interface for better user experience.
- Implement functionality for managing overdue fines and notifications.
- Add support for searching and filtering books.

## Output
<img width="789" alt="image" src="https://github.com/Imbiber/OOPs/assets/118832071/84d77287-4426-436c-902c-21cff3f43dd9">
<img width="649" alt="image" src="https://github.com/Imbiber/OOPs/assets/118832071/4bb9dcc3-f050-4fc4-8154-bdde3c6008fa">

# Object-Oriented Programming (OOP) Concepts Used

## 1. Encapsulation

**Definition**: Encapsulation is the bundling of data and methods that operate on the data into a single unit, called a class. It restricts access to some of the object's components, allowing only methods to manipulate the object's state.

**Usage in the Code**: Encapsulation is achieved by using access modifiers like `private` for class fields (attributes) and providing public methods (getters and setters) to access and modify them. For example, the `Book` class encapsulates details such as book ID, title, author, and availability status, and provides methods to access and modify these details.

## 2. Abstraction

**Definition**: Abstraction is the process of hiding the implementation details of a class and showing only the necessary features of the object. It focuses on what an object does rather than how it does it.

**Usage in the Code**: Abstraction is demonstrated by hiding the internal implementation details of classes and exposing only the necessary functionalities through methods. For instance, the `Library` class abstracts away the implementation details of book and patron management, borrowing, and returning operations, providing a simple interface for users to interact with.

## 3. Inheritance

**Definition**: Inheritance is the mechanism by which one class acquires the properties and behavior of another class. It promotes code reusability and establishes a relationship between classes.

**Usage in the Code**: Inheritance is not explicitly used in this code snippet. However, it could be applied if there were multiple types of books or patrons with shared characteristics, allowing for the creation of subclasses to represent specific types while inheriting common properties and behaviors from a superclass.

## 4. Polymorphism

**Definition**: Polymorphism allows objects of different classes to be treated as objects of a common superclass. It enables a single interface to represent different underlying forms (types).

**Usage in the Code**: Polymorphism is also not explicitly used in this code snippet. However, it could be implemented through method overriding, where subclasses could override methods inherited from a superclass to provide specialized behavior while maintaining a common interface.

## 5. Class

**Definition**: A class is a blueprint for creating objects. It defines the attributes (fields) and methods common to all objects of the same type.

**Usage in the Code**: The code demonstrates the use of classes to represent real-world entities such as books, patrons, and the library itself. Each class encapsulates related data and behavior.

## 6. Object

**Definition**: An object is an instance of a class. It represents a real-world entity with properties (attributes) and behaviors (methods).

**Usage in the Code**: Objects are instances of classes, and the code creates instances of the `Book`, `Patron`, and `Library` classes to represent specific books, patrons, and the library, respectively.

## 7. Constructor

**Definition**: A constructor is a special type of method that is automatically called when an object of a class is created. It is used to initialize the object's state.

**Usage in the Code**: Constructors are used to initialize objects of a class. In the code, constructors are used in the `Book`, `Patron`, and `Library` classes to initialize their respective instances.

## 8. Method

**Definition**: A method is a collection of statements that perform a specific task. It represents the behavior or actions that objects of a class can perform.

**Usage in the Code**: The code contains methods for borrowing and returning books in the `Library` class, as well as getter methods to retrieve information about books and patrons.





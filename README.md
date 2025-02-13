# CSC Lab Practical 01 - Student Class

## Overview

This project implements a simple `Student` class in Java as part of a Computer Science lab practical. The `Student` class manages basic student information including name, email, and gender.

## Features

- Create and manage student objects with name, email, and gender attributes
- Getter and setter methods for each attribute
- Input validation for gender (only 'M' or 'F' allowed)

## Class Structure

### Student Class

- **Attributes:**
  - `name` (String)
  - `email` (String)
  - `gender` (char)

- **Methods:**
  - `setName(String name)`
  - `getName()`
  - `setEmail(String email)`
  - `getEmail()`
  - `setGender(char gender)`
  - `getGender()`

### TestStudent Class

A separate class to demonstrate the functionality of the `Student` class.

## Usage

- Student student = new Student();
- student.setName("John Doe");
- student.setEmail("john.doe@example.com");
- student.setGender('M');
- System.out.println("Name: " + student.getName());
- System.out.println("Email: " + student.getEmail());
- System.out.println("Gender: " + student.getGender());

  
## Requirements

- Java Development Kit (JDK) 8 or higher

## How to Run

1. Compile the Java files:
2. Run the TestStudent class:

## Contributing

This project is for educational purposes. Contributions, suggestions, and feedback are welcome for improving the implementation or extending the functionality.

## License

This project is open-source and available under the [MIT License](https://opensource.org/licenses/MIT).

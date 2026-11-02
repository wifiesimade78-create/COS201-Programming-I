
# COS 201 — Computer Programming I

## STUDENT INFORMATION

- **Student Name:** Imade Isaac
- **Matriculation Number:** 25/17643
- **Programme:** Software Engineering
- **Course Code:** COS 201
- **Course Title:** Computer Programming I

---

## PROJECT DESCRIPTION

This repository contains my practical programming assignments for Weeks 1–3 of COS 201 (Computer Programming I).

The practical exercises are designed to introduce fundamental programming concepts using the Java programming language. They cover introductory programming, the Java development environment, variables, data types, arithmetic operations, and input and output.

The repository is organised into separate folders for each week to make the source files easy to identify and access.

---

## PROJECT STRUCTURE

```text
COS201-Programming-I/
│
├── README.md
│
├── week01/
│   └── FirstProgram.java
│
├── week02/
│   ├── HelloWorld.java
│   ├── PrintExample.java
│   └── ErrorExample.java
│
└── week03/
    ├── SimpleCalculator.java
    ├── AverageCalculator.java
    └── ItemCost.java
```

---

# WEEK 1: INTRODUCTION TO PROGRAMMING AND PROBLEM-SOLVING

## Practical File

`week01/FirstProgram.java`

## Objective

To create and execute a basic Java program that displays introductory messages, student information, course details, reasons programming is important to Software Engineering, and a personal learning goal.

## Concepts Practised

1. Understanding the basic structure of a Java program.
2. Creating a Java class.
3. Understanding the `main()` method.
4. Displaying output using `System.out.println()`.
5. Writing comments to explain sections of code.
6. Organising program output into readable sections.
7. Understanding the importance of programming in Software Engineering.

## Programme Explanation

The program begins by displaying introductory messages about COS 201 and computer programming.

It then displays my student information, including my name, matriculation number, programme and course details.

The program also explains three reasons programming is important to Software Engineering:

- It helps software engineers build applications that solve real-life problems.
- It makes it possible to automate tasks and process information accurately.
- It develops logical thinking, creativity and problem-solving skills.

Finally, it displays my personal learning goal for COS 201.

## How to Compile and Run

Open a terminal inside the `week01` folder and enter:

```bash
javac FirstProgram.java
java FirstProgram
```

---

# WEEK 2: DEVELOPMENT ENVIRONMENT AND FIRST JAVA PROGRAM

## Practical Files

1. `week02/HelloWorld.java`
2. `week02/PrintExample.java`
3. `week02/ErrorExample.java`

## Objective

To practise writing and running Java programs, displaying messages, understanding Java statements and becoming familiar with the basic Java development environment.

## Concepts Practised

1. Java source files and class structure.
2. The `main()` method.
3. Displaying messages using `System.out.println()`.
4. Understanding the difference between `print()` and `println()`.
5. Writing Java statements correctly.
6. Understanding the importance of semicolons.
7. Identifying and correcting basic syntax errors.

## Programme Explanations

### 1. HelloWorld.java

This is the main Week 2 practical program.

It displays the original introductory messages required by the assignment, followed by my student information, course details, Week 2 topic and personal learning goal.

It also demonstrates how `System.out.println()` displays messages on separate lines.

### 2. PrintExample.java

This program demonstrates the difference between `print()` and `println()`.

The `print()` method displays text without automatically moving to a new line, while `println()` displays text and moves to the next line.

### 3. ErrorExample.java

This program demonstrates correctly written Java statements.

It highlights the importance of proper Java syntax and the use of semicolons at the end of statements.

## How to Compile and Run

Open a terminal inside the `week02` folder.

**HelloWorld.java**

```bash
javac HelloWorld.java
java HelloWorld
```

**PrintExample.java**

```bash
javac PrintExample.java
java PrintExample
```

**ErrorExample.java**

```bash
javac ErrorExample.java
java ErrorExample
```

Note: `HelloWorld.java` is the main Week 2 practical submission. The other two programs are included as additional practice exercises.

---

# WEEK 3: VARIABLES, DATA TYPES, EXPRESSIONS AND INPUT/OUTPUT

## Practical Files

1. `week03/SimpleCalculator.java`
2. `week03/AverageCalculator.java`
3. `week03/ItemCost.java`

## Objective

To understand and apply Java variables, data types, arithmetic operators, expressions and keyboard input using the Scanner class.

## Concepts Practised

1. Declaring and initialising variables.
2. Understanding common Java data types.
3. Using `String`, `int` and `double` variables.
4. Accepting keyboard input using `Scanner`.
5. Performing arithmetic calculations.
6. Using addition, subtraction, multiplication and division.
7. Using conditional statements such as `if` and `else`.
8. Displaying formatted numerical results using `printf()`.

## Programme Explanations

### 1. SimpleCalculator.java

This program accepts two numbers from the user and performs basic arithmetic operations.

The program calculates:

- Sum of the two numbers.
- Difference between the two numbers.
- Product of the two numbers.
- Quotient of the two numbers.

It also uses an `if-else` statement to check whether the second number is zero before performing division. This prevents division by zero.

### 2. AverageCalculator.java

This program accepts a student's name and three academic scores.

It calculates the total score by adding the three scores together.

It then calculates the average by dividing the total score by three.

Finally, it displays the student's name, individual scores, total score and average score.

### 3. ItemCost.java

This program calculates the total cost of purchased items.

It accepts three inputs:

- Item name.
- Quantity purchased.
- Unit price.

The program multiplies the quantity by the unit price to calculate the total cost.

It then displays a purchase summary containing the item name, quantity, unit price and total cost.

## How to Compile and Run

Open a terminal inside the `week03` folder.

**SimpleCalculator.java**

```bash
javac SimpleCalculator.java
java SimpleCalculator
```

**AverageCalculator.java**

```bash
javac AverageCalculator.java
java AverageCalculator
```

**ItemCost.java**

```bash
javac ItemCost.java
java ItemCost
```

## Suggested Test Cases

| Program | Input | Expected Result |
|---|---|---|
| SimpleCalculator | 20 and 4 | Sum: 24, Difference: 16, Product: 80, Quotient: 5 |
| SimpleCalculator | 20 and 0 | Displays a message that division by zero is not possible |
| AverageCalculator | 70, 80 and 90 | Total: 240, Average: 80 |
| ItemCost | Quantity: 3, Unit Price: 1500 | Total Cost: 4500 |

---

# DEVELOPMENT TOOLS AND ENVIRONMENT

The following tools and technologies are relevant to this project:

- **Programming Language:** Java
- **Development Kit:** Java Development Kit (JDK)
- **Code Editor:** A Java-compatible text editor or IDE
- **Version Control:** Git
- **Code Hosting Platform:** GitHub

The Java Development Kit is required to compile and execute the Java source files.

GitHub is used to store and organise the practical assignments online.

---

# CONCLUSION

The COS 201 practical assignments for Weeks 1–3 provide an introduction to programming using Java.

Through these exercises, I have practised creating Java classes, writing output statements, understanding variables and data types, receiving user input, performing arithmetic calculations and using conditional statements.

These practical exercises provide a foundation for developing more advanced programming and problem-solving skills as a Software Engineering student.

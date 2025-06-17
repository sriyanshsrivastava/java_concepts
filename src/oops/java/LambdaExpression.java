package oops.java;  // package declaration

/*
 * 💡 Lambda Expressions in Java:
 *
 * 👉 Introduced in Java 8 to provide a clear and concise way to represent instances of functional interfaces.
 * 👉 Syntax: (parameters) -> { expression or block of code }
 * 👉 Removes boilerplate code — no need to create separate classes or anonymous inner classes for simple functionality.
 * 👉 Mainly used to pass behavior as a parameter (functional programming style).
 * 👉 Works only with functional interfaces (interfaces with a single abstract method).
 *
 * Example:
 * Lambda l = (i, j) -> i + j;  // Compact way to provide implementation of 'show' method
 *
 * 📌 Why use lambda:
 * - Improves readability.
 * - Reduces the amount of code (no need for new class or method override).
 * - Makes code more maintainable and expressive.
 */


// Functional interface with a single abstract method 'Add' that takes two ints and returns an int
interface Lambda {
    int add(int num1, int num2);
}

public class LambdaExpression {
    public static void main(String[] args) {
        // Creating an instance of Lambda using a lambda expression that adds two numbers
        Lambda l = (i, j) -> i + j;

        // Calling the 'show' method of Lambda with arguments 5 and 6
        int result = l.add(5, 6);

        // Printing the result of the addition
        System.out.println(result);
    }
}

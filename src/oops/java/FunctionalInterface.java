package oops.java;
/*
 * 💡 Functional Interface & Lambda Expression in Java:
 *
 * 👉 Functional Interface:
 * - An interface that has exactly **one abstract method** is called a functional interface.
 * - It can have **default** and **static methods** (from Java 8) but only one abstract method.
 * - Marked with **@FunctionalInterface** annotation (optional, but helps catch errors at compile-time).
 * - Example: Runnable, Callable, Comparator, etc. are functional interfaces.
 *
 * 👉 Lambda Expression:
 * - A lambda is a **short-cut way to provide implementation of the abstract method of functional interface**.
 * - Removes the need for creating an anonymous inner class.
 * - Syntax: (parameters) -> { body }
 *
 * Example:
 * Functional Interface:
 * @FunctionalInterface
 * interface Calculator {
 *     int add(int a, int b);
 * }
 *
 * Using Lambda:
 * Calculator calc = (a, b) -> a + b;
 * System.out.println(calc.add(5, 3));  // Output: 8
 *
 * ➡ Lambda expressions make code shorter, cleaner, and are widely used in streams and collections.
 */

@java.lang.FunctionalInterface
interface I{
    void show();
}

public class FunctionalInterface {
    public static void main(String[] args) {
        // using anonymous inner class to override the method
        I obj = new I(){
            @Override
            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();

        // Using lambda expressions to override the method show()
        // lambda expression
        I obj2 = ()-> {
            System.out.println("In new show Obj2");
        };
        obj2.show();

        // we can also write same code as below short form of lambda expression
        I obj3 = ()-> System.out.println("In new show Obj2"); // one line statement don't need curly Bracket.
        obj3.show();

        /*
         * 💡 Lambda Expressions in Java (since Java 8)
         *
         * 👉 Why Lambda?
         * - To reduce boilerplate code when using functional interfaces.
         * - Normally, implementing a functional interface (single abstract method) needs:
         *      → A separate class OR
         *      → An anonymous inner class (long, repetitive code)
         * - Lambda lets you define the method's logic *inline*, without declaring a class or overriding method explicitly.
         *
         * 👉 When to use?
         * - With functional interfaces (e.g., Runnable, Comparator, ActionListener, custom interfaces with 1 abstract method).
         * - In streams, collections, event handling, threads — anywhere you want a quick, small implementation.
         *
         * 👉 How does it remove boilerplate?
         * - Instead of writing:
         *      Runnable r = new Runnable() {
         *          public void run() {
         *              System.out.println("Running thread");
         *          }
         *      };
         * - We can simply write:
         *      Runnable r = () -> System.out.println("Running thread");
         * - No need to:
         *      → Write the class name again
         *      → Mention method name
         *      → Write access modifiers or override annotations
         *      → Because compiler already knows the method name because of there can be only one method in functional interface.
         *
         * 👉 Syntax:
         *      (parameters) -> { method body }
         *
         * Example:
         *      FunctionalInterfaceExample fi = () -> System.out.println("Hello");
         */

    }
}

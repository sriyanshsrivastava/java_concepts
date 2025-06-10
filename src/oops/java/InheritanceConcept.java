package oops.java;
/*
 * ===============================
 *        Java Inheritance
 * ===============================
 *
 * Inheritance is one of the fundamental pillars of Object-Oriented Programming (OOP).
 * It allows a class (child/subclass) to inherit fields and methods from another class (parent/superclass).
 * This promotes reusability, modularity, and polymorphism.
 *
 * -------------------------------
 *        Why Use Inheritance?
 * -------------------------------
 * - Eliminates code duplication by reusing existing code.
 * - Supports polymorphism via method overriding.
 * - Encourages a logical class hierarchy ("is-a" relationship).
 *
 * -------------------------------
 *        Syntax of Inheritance
 * -------------------------------
 * class Parent {
 *     // fields and methods
 * }
 *
 * class Child extends Parent {
 *     // additional fields and methods
 * }
 *
 * -------------------------------
 *        Types of Inheritance in Java
 * -------------------------------
 * 1. Single Inheritance: One subclass inherits from one superclass.
 * 2. Multilevel Inheritance: Class A → Class B → Class C.
 * 3. Hierarchical Inheritance: Multiple subclasses inherit from a single superclass.
 *
 * ⚠️ Java does not support multiple inheritance with classes to avoid ambiguity.
 * ✅ Java supports multiple inheritance via interfaces.
 *
 * -------------------------------
 *        Method Overriding
 * -------------------------------
 * - A subclass can override a method of its superclass using `@Override`.
 * - Enables runtime polymorphism (dynamic method dispatch).
 * - Only inherited methods can be overridden (not constructors or static methods).
 *
 * -------------------------------
 *        Access Modifiers
 * -------------------------------
 * - private: Not accessible outside the class (even by subclasses).
 * - default (no modifier): Accessible within the same package.
 * - protected: Accessible in subclass (even in a different package).
 * - public: Accessible from everywhere.
 *
 * -------------------------------
 *        'this' Keyword
 * -------------------------------
 * - Refers to the **current object** (the object on which the method is called).
 * - Used to:
 *   → Differentiate between instance variables and method parameters with the same name.
 *   → Call another constructor in the same class: `this()`
 *   → Pass the current object to another method: `someMethod(this)`
 *
 * Example:
 * class Example {
 *     private int value;
 *     public void setValue(int value) {
 *         this.value = value; // 'this.value' refers to instance variable, 'value' is the parameter
 *     }
 * }
 *
 * -------------------------------
 *        'super' Keyword
 * -------------------------------
 * - Refers to the **parent class object**.
 * - Used to:
 *   → Access parent class methods or variables: `super.methodName()`
 *   → Call parent class constructor: `super()` — must be the first statement in child constructor
 *
 * Example:
 * class Animal {
 *     Animal() {
 *         System.out.println("Animal constructor");
 *     }
 *     void speak() {
 *         System.out.println("Animal speaks");
 *     }
 * }
 *
 * class Dog extends Animal {
 *     Dog() {
 *         super(); // calls Animal constructor
 *         System.out.println("Dog constructor");
 *     }
 *     void speak() {
 *         super.speak(); // calls Animal's speak method
 *         System.out.println("Dog barks");
 *     }
 * }
 *
 * -------------------------------
 *        Real Example:
 * -------------------------------
 * class Animal {
 *     void makeSound() {
 *         System.out.println("Animal makes sound");
 *     }
 * }
 *
 * class Cat extends Animal {
 *     @Override
 *     void makeSound() {
 *         System.out.println("Cat meows");
 *     }
 * }
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         Animal a = new Cat(); // Upcasting
 *         a.makeSound();        // Output: Cat meows (polymorphism)
 *     }
 * }
 *
 * -------------------------------
 *        Summary:
 * -------------------------------
 * - Inheritance is implemented using `extends`.
 * - It allows one class to reuse another class’s properties and methods.
 * - `this` is used to refer to the current object.
 * - `super` is used to refer to the immediate parent object.
 * - Overriding allows a subclass to define custom behavior.
 */

class A{
    public A(){
        super();
        System.out.println("In A");
    }

    public A(int b){ // parameterised constructor in class B
        super();
        System.out.println("In A Int");
    }
}
class B extends A{
    public B(){         // it will automatically call the constructor of class A because B extending to A class
        super(5);    // every constructor has this super() method by default even we don't mention it and this is the
                        // first statement of every constructor and this means it says call the constructor of Super Class.
                        // if we mention an argument in super in default constructor it calls default constructor of itself and parameterised
                        // constructor of super or parent class and if we don't give parameter it will call default constructor of the super class and vice-versa.
        System.out.println("In B");
    }
    public B(int n){    // parameterised constructor
        super();           // default method even if we don't mention this and will call default non-parametrised constructor of the parent class.
//        super(n);        // passing a value in super() method it calls the parameterised constructor of parent of super class.
//        this();             // this() method will call default constructor of the came class
        System.out.println("In B Int");
    }
    /*
     * Default constructor: auto-created if no constructor is defined.
     * Default super(): compiler adds super() to call parent constructor implicitly.
     * this(): used to call another constructor in the same class, must be first line.
     */
}

public class InheritanceConcept {
    public static void main(String[] args) {

        B obj = new B(); // uses default constructor because we are not passing any argument
        B obj1 = new B(5); // will call parameterised constructor not default constructor of that class.


    }
}

/*
 * NOTE:
 * Every class in Java implicitly extends the Object class.
 * Object is the root class of all Java classes.
 * It provides common methods like toString(), equals(), hashCode(), etc.
 */

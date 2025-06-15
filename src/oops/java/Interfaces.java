package oops.java;

/*
 * 💡 Interface in Java:
 *
 * 👉 An interface is like a fully abstract class — it defines a contract with method signatures (no implementation).
 * 👉 All methods in an interface are implicitly public and abstract (until Java 8 added default and static methods).
 * 👉 All variables in an interface are public, static, and final (constants).
 * 👉 A class uses the 'implements' keyword to adopt an interface and must provide implementations for all methods.
 *
 * 🔹 How it relates to abstract class:
 * - Both interfaces and abstract classes provide abstraction (hiding implementation details).
 * - Abstract class can have both abstract and concrete methods, while interface (before Java 8) had only abstract methods.
 * - Interface provides pure abstraction (no method bodies at all in pre-Java 8), while abstract class can have partial abstraction.
 * - A class can extend only one abstract class (single inheritance), but can implement multiple interfaces (multiple inheritance of type).
 *
 * 🔹 What interfaces are used for:
 * - To define a standard set of methods that multiple unrelated classes can implement.
 * - To achieve multiple inheritance (since Java doesn't support multiple class inheritance).
 * - To separate what needs to be done (interface) from how it is done (implementing class).
 *
 * Example:
 * interface Animal {
 *     void sound();
 * }
 *
 * class Dog implements Animal {
 *     public void sound() {
 *         System.out.println("Bark");
 *     }
 * }
 *
 * Here, Dog commits to the contract of Animal by providing its own version of the sound() method.
 */

import javax.swing.*;

interface Animal{
    // we can create a variable also but by default it will be final and static.
    // so we can not change it or manipulate these variable so there is no point of using it.

//    int age; // will throw error we have to give value because it is final and static.
//    String area; // same for this

    // instead we can do like below.
    int age = 44;
    String area = "Delhi";

    // we don't need to use public and abstract keyword because in interface it is by default abstract methods.

    //public abstract void show();
    //public abstract void config();

    // instead we can declare like below also it will be correct also.
    void sound();
    void config();
}

// implementing this interface in this Dog class.
class Dog implements Animal{
    // we must have to define all the methods of interfaces.
    public void sound(){
        System.out.println("dog is barking...");
    }

    public void config() {
        System.out.println("in Dog config...");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Animal obj; // this will not throw this means we can use interface as type.
        // Animal obj1 = new Animal(); // this will not work because we can't create object of Animal interface because by default it is abstract class.
        Animal obj1 = new Dog(); // we can do like this, we can create the object of implementing class and type of interface.

        // Now we can call all the methods of the interface using implementing class which is Dog Class here.
        obj1.sound();
        obj1.config();

        // we can do like this
        System.out.println(Animal.age);
        System.out.println(Animal.area);
        // but we can not change its value

//        Animal.age = 50; // error: can not assign value to final variable.
//        Animal.area = "Mumbai"; // will throw error because we can not change final variable it is constant.


        /* we can have some question?
            1. why we can not access the variable using object of implementing class?
            -- because we are implementing it not extending it, and we can only implement methods()
               of the interface not variables. so we can not access the variable using object of the implementing class.

            2. why we can not change the value of the variable of the interfaces?
            -- because we know that by default variable of the interface is static and final. so final is like constant
               due to this final we can not change the value of final variable.

            3. can we implement from multiple interfaces?
            -- yes, we can implement multiple interfaces, but we have to define all the methods of all the interface we are
               implementing.
               example syntax:

                           interface A{
                                void method1();
                                void method2();
                           }

                           interface B{
                                void method3();
                                void method4();
                           }

                           class Example implements A,B{
                                // here we have to implement all the methods of both the interface
                                // like method1, method2, method3 and method4.
                                // we must override all the methods of interfaces its implementing.
                           }
         */
    }
}

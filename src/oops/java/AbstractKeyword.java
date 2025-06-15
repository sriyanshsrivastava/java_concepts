package oops.java;

/*
 * The 'abstract' keyword in Java is used to define:
 *
 * 1. Abstract Classes:
 *    - A class declared with 'abstract' cannot be instantiated.
 *    - It can contain abstract methods (methods without a body) and concrete methods (with a body).
 *    - Used as a base for subclasses to provide specific implementations.
 *
 * 2. Abstract Methods:
 *    - Declared without a body; ends with a semicolon.
 *    - Must be implemented by subclasses unless the subclass is also abstract.
 *
 * Example:
 * abstract class Shape {
 *     abstract void draw(); // abstract method
 * }
 *
 * class Circle extends Shape {
 *     void draw() {
 *         System.out.println("Drawing Circle");
 *     }
 * }
 */

// to understand Abstract keyword lets create a class named car and give two method let say
// drive(), and playMusic()

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

abstract class Car{ // we need to make this class abstract to hold abstract methods.
    public abstract void drive(); // making this method abstract
        // lets we don't know the method how car will drive
        // lets user will decide the method
        // and, he will override this method
        // it is like buying a new phone and, it promises many feature but
        // none of it works. this method is just like that

        /*
        so question arises if we don't know how it works then why we're creating this class
        in first place? at this point we know how to play music but, don't know how to drive this?
        so we can do one thing instead of defining a method we can declare it. only wo other will have to
        define this method by himself. so we can remove curly braces at end and input semicolon at the end of statement
        that's why we are adding abstract means making the method abstract which means it's just an idea, and
        you have to implement it as per your logic. but problem is - we can only define abstract method in abstract class.
         */
    // another abstract method in this abstract class.
    public abstract void fly();// but we must have to override this method in child class to work properly.

    // abstract class can have non-abstract methods.
    // abstract class may have or have not abstract method to be valid, but opposite is not valid.
    // so it can have abstract method and normal method both.
    // abstract class may have multiple abstract method. is not a problem it will not give error.
    public void playMusic(){
        System.out.println("playing Music ...");
    }
}

// I want someone which is using my class also define this method of drive()
abstract class WagonR extends Car{
    // so WagonR class is responsible to define drive method;
    // so this class must have abstract method overridden if it inherits form abstract class.
    // it is compulsory to override the all the abstract method to work it properly in child class.
//    public void drive(){  // overriding drive abstract method of super class Car.
//        System.out.println("Driving...");
//    }

    // overriding fly() abstract method of super class Car.
//    public void fly(){
//        System.out.println("Flying the car...");
//    }
    // if we don't override all the abstract method of parent class in this then this class will also become abstract.
}

abstract class Creta extends Car{ // making this class abstract
    // if we don't override all the abstract method in this class it will become abstract class itself.
    // so we have to declare this class as abstract to work properly else it will throw error.
}

class UpdatedWagonR extends WagonR{
    // overriding all the abstract method of parent class. or super parent class
    public void drive(){
        System.out.println("Driving...");
    }

    public void fly(){
        System.out.println("Flying the car...");

    }

    // and this will work as expected.

}


public class AbstractKeyword {
    public static void main(String[] args) {
        //Car obj = new Car(); // but we can't make object of abstract class. but we can have reference abstract class.
                                // we can not create an object of an abstract class.
        Car obj = new UpdatedWagonR(); // we can do like this it is permissible.
        obj.drive(); // we don't know the logic but, I can use this method even it's not doing anything in the code
        obj.playMusic(); // so we can call this method too.
        obj.fly(); // we can call this method too.
    }
}

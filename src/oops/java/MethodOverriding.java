package oops.java;

/*
 * Topic: Method Overriding in Java
 *
 * - Method overriding occurs when a subclass provides a specific implementation
 *   of a method that is already defined in its superclass.
 * - The overridden method in the subclass must have the same name, return type,
 *   and parameters as the method in the superclass.
 * - Used to achieve **runtime polymorphism** (dynamic method dispatch).
 * - The version of the method that gets called is determined by the type of
 *   the object that is created, not the reference type.
 *
 * Rules of Method Overriding:
 * 1. The method must be inherited from the superclass.
 * 2. The method in the subclass should have the same signature.
 * 3. Access modifier in subclass should be same or more accessible (e.g., protected → public).
 * 4. Final, static, and private methods cannot be overridden.
 *
 * Example in this file:
 * - Class `One` defines methods: `show()` and `config()`
 * - Class `Two` extends `One` and adds its own method `show1()`
 * - The call to `show()` and `config()` is inherited from `One`
 * - Overriding can be shown by redefining `show()` in `Two` with the same signature
 *
 * Real Use: Method overriding is widely used in frameworks and APIs (e.g., when extending classes and customizing behavior).
 */



class One{
    public void show(){
        System.out.println("In One show");
    }
    public void config(){
        System.out.println("In One config");
    }
}

class Two extends One{

    // i am overriding show method of show method of One class in this class
    public void show(){
        System.out.println("In Two show");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        Two obj = new Two();
        obj.show(); // this will call his own show() method not of its super class
        obj.config(); // this the object will inherit form super class
    }
}

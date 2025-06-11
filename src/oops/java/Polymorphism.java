package oops.java;

/*
 * 🔄 Dynamic Method Dispatch (Runtime Polymorphism)
 *
 * - When a superclass reference variable refers to a subclass object,
 *   and an overridden method is called using that reference,
 *   the version in the subclass is executed.
 *
 * - The method to be executed is determined at runtime, not compile time.
 *
 * - This allows Java to support runtime polymorphism.
 *
 * ✅ Only overridden instance methods participate in dynamic dispatch.
 * ❌ Static methods, instance variables, and constructors do not.
 *
 * Example:
 *   Animal a = new Dog();
 *   a.sound(); // Calls Dog's implementation of sound()
 *
 * This helps in writing flexible and extensible code (e.g., using interfaces or abstract classes).
 */

class A1{
    public void show(){
        System.out.println("in A1 Show");
    }

}
//child of class A
class B1 extends A1{
    public void show(){
        System.out.println("in B1 Show");
    }


}
//child of class A
class C1 extends A1{
    public void show(){
        System.out.println("in C1 Show");
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        A1 obj = new A1();
        obj.show();  // this will call show() method of Class A1
//        A1 obj1 = new B1(); // we can have type of parent class and object of child class
                            // we can do this in java with no errors but reverse is not possible
                            // means we can not have type (reference variable) of child class with the object of
                            // parent class.

        obj = new B1();
        obj.show();         // this will call show() method of class B1

        obj = new C1();
        obj.show();         // this will call show() method of class C1


        /*
         so method calling by object is dependent of the class that object is not the type of the object class
         it may be a type of parent class, but it will call the method of own class. and this is called dynamic method
         dispatching.
        */


    }
}

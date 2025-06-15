package oops.java;

/*
 * 💡 Using Anonymous Inner Class with Abstract Class:
 *
 * 👉 When we have an abstract class, we cannot create its object directly because it's incomplete.
 * 👉 Normally, we'd create a separate subclass and provide implementations for the abstract methods.
 * 👉 But if we want to provide implementation for one-time use (no need to create a full named subclass),
 *    we can use an anonymous inner class.
 *
 * 👉 The anonymous inner class lets us create an instance of an abstract class
 *    and provide implementations for its abstract methods on the spot.
 *
 * Example:
 * abstract class Vehicle {
 *     abstract void show();
 * }
 *
 * Vehicle obj = new Vehicle() {
 *     void show() {
 *         System.out.println("Vehicle started!");
 *     }
 * };
 *
 * obj.show();  // Calls the overridden method
 *
 * This avoids creating a separate named subclass just to implement 'start' for one-time use.
 * we can see this concept in working mode below.
 */

abstract class Vehicle{
    public abstract void show();
}

public class AnonymousClassWithAbstractClass {
    public static void main(String[] args) {
        //Vehicle obj = new Vehicle();
        // above syntax will give error

        // we have to override all the abstract methods of abstract Vehicle class using anonymous inner class.
        Vehicle obj = new Vehicle() {

            public void show() {
                System.out.println("Overridden show() method of abstract class Vehicle.");
            }
            // we can implement this not just for one method, but any number of methods. it will work perfectly fine.
        };

        // lets call show() method on the object of Abstract Class Vehicle

        obj.show();

    }
}

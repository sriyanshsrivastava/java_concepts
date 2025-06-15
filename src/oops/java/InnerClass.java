package oops.java;
/*
 * 💡 Inner Class in Java:
 *
 * 👉 An inner class is a class defined within another class.
 * 👉 It is logically bound to the outer class and can access its members (even private ones).
 * 👉 Used to group classes that belong together and to increase encapsulation.
 *
 * 🔹 Types of Inner Classes:
 * 1️⃣ **Non-static (regular) inner class**
 *    - Associated with an instance of the outer class.
 *    - Can access all members of the outer class (including private).
 *
 * 2️⃣ **Static nested class**
 *    - Like a static member of the outer class.
 *    - Can only access static members of the outer class directly.
 *    - No link to an outer class instance.
 *
 * 3️⃣ **Local inner class**
 *    - Defined inside a method or block.
 *    - Visible only within that method/block.
 *
 * 4️⃣ **Anonymous inner class**
 *    - No name, defined and instantiated in a single expression.
 *    - Often used for short-lived implementations, like event handling.
 *
 * Example:
 * class Outer {
 *     private int data = 10;
 *
 *     class Inner {
 *         void display() {
 *             System.out.println("Data: " + data); // Can access private member of outer
 *         }
 *     }
 * }
 *
 * // Usage:
 * Outer outer = new Outer();
 * Outer.Inner inner = outer.new Inner();
 * inner.display();
 */


// Outer class Creation
class Outer{
    int age;
    public void show(){
        System.out.println("In outer show");
    }

    // Inner Class into Outer class, means Inner class is inside the outer class.
    // we can make this class static.
    //static class Inner{  // we can make inner class as static class.
    class Inner{
        public void config(){
            System.out.println("in Inner config");
        }
    }
}
// static class can only be created inside any class. Outer class static will not work it will throw error.


public class InnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();
        // Inner obj = new Inner(); // we can not do this here we can't create a object of inner class directly.
        // Outer.Inner obj1 = new Inner(); // this will also don't work
        Outer.Inner obj1 = obj.new Inner(); // so to create object of Inner class we need to have object of Outer class.
        obj1.config(); // this way we can access the config() method of Inner class.

        Outer.Inner obj2; // we can declare this as type of the class but we have to access outer first and then inner.

    }
}

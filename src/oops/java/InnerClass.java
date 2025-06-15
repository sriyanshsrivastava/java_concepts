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


public class InnerClass {
}

package oops.java;

/* let's create a class of name Example.now my goal is to change the behaviour of show()
 method of this class
 -- we know one solution just create a new class and extend it to Example class and
 -- Override the method show() in that class but what if we want only one use of it?
 is it feasible to create a new class for one time use ? what do you think?
 to solve this problem we have a solution named anonymous inner class.
 let's implement this concept in main method.
 */

class Example{
    public void show(){
        System.out.println("In Example show.");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        // creating an object of Example class
        // we have always done like below to create object
        // Example obj = new Example();

        // to implement new anonymous inner class we need to follow below syntax
        Example obj = new Example(){
            // this will create a subclass of Example class without any name means it will be anonymous.
            // this creates an instance of an unnamed subclass of Example class.
            // and here we can override the required method.
            public void show(){
                System.out.println("in New show.");
            }
        };

        // calling the overridden method
        // we can normally call the show() method on Example class method,
        // and it will prefer overridden method. not of the parent or original method
        // present in the class itself.

        obj.show(); // this statement will call overridden method, means it will print "in New show." on the console.

    }
}

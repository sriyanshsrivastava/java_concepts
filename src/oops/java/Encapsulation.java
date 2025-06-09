package oops.java;

/*
 * Encapsulation is one of the core principles of Object-Oriented Programming (OOP).
 * It is all about protecting sensitive data by restricting direct access from outside the class.
 *
 * To achieve encapsulation:
 * - We make instance variables 'private' so they cannot be accessed directly from outside the class.
 * - We provide public 'getter' and 'setter' methods to read and modify the values of those variables.
 *
 * This approach allows:
 * - Controlled access to the internal data.
 * - Validation logic inside setter methods to prevent invalid data.
 * - Flexibility to change internal implementation without affecting external code.
 * - Better maintainability and modular design.
 *
 * Example:
 * private int age;
 * public void setAge(int age) {
 *     if (age >= 0) {
 *         this.age = age;
 *     }
 * }
 * public int getAge() {
 *     return this.age;
 * }
 *
 * Notes:
 * - If you only provide a getter, the field becomes read-only.
 * - If you only provide a setter, it becomes write-only (rare use case).
 * - Encapsulation helps in writing secure, robust, and maintainable code.
 */

class Human{
    private int age;
    private String name;

    // getter method for Age
    public int getAge(){
        return age;
    }

    // setter method for Age

    public void setAge(int age){
        this.age = age;
    }

    // getter method for name
    public String getName(){
        return name;
    }

    // setter method for name
    public void setName(String name){
        this.name = name;
    }

    /*
    we are passing int and string int the getter setter method we can use different name to
    make it clear for compiler, so it assigns the value and differentiate between setter argument
    and instance variable;
    but, here I have used same name for setter argument and instance variable so compiler will
    confuse to decide what is what that's why "this" keyword comes to play.
    this.variable name tells compiler that it's an instance variable and only variable name is argument,
    so it saves argument passed in setter method to the instance variable of that object.

    Bonus: (this) keyword does more than just resolve naming conflicts —
    it's a reference to the current object, and is also used in constructor chaining and method chaining
    we will discuss it in later part
     */

}


public class Encapsulation {
    public static void main(String[] args) {

        Human obj = new Human();

        /*
        encapsulation is all about protecting sensitive data to directly access form outside the class
        for this we make instance variable private, but it brings a problem we can not use this variable
        outside the class. so how can we assign value? how can we use them? do we have any method?
        The answer is yes we have method to access the private variable we access it by method mainly named
        getter and setters. it fulfills the purpose without exposing my variable data and this provides
        capability to add check and balances to the method so no one can misuse it. protecting this data using this
        way is encapsulation. here in this file we are encapsulating both the instance variable making them private and
        then accessing them using getters and setters methods.
        */

//        obj.age =11;
//        obj.name = "Satish"; // we can not access the variable using this because it is private and we can not use
                               // outside the class.

        System.out.println(obj.getAge()); // this will print 0 because there is no value assigned to the variable after making object of this class
        System.out.println(obj.getName()); // this will print 'null'

        // setting the age and name to the object

        obj.setAge(25);
        obj.setName("Satish");

        // now again check the name and age now it will give correct output

        System.out.println(obj.getAge());
        System.out.println(obj.getName());


    }
}

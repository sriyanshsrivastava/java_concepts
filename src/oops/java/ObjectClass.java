package oops.java;
/*
 * In this file, we explore the Object class in Java.
 *
 * Every class in Java implicitly extends the Object class.
 * This means that even if we don't explicitly extend it,
 * Java automatically does it internally.
 *
 * As a result, all classes inherit the predefined methods
 * of the Object class, such as toString(), equals(), hashCode(), etc.
 */

import java.util.Objects;

class Laptop{
     String model;
     int price;

     // Overrides the toString method of super-class, Object class of java.
//     public String toString(){
//         return model+" : "+price;
//     }

     // Overrides the equals() method of super-class, Object class of java.
     // this will check if the all the properties of laptop is equals to others laptop object
     // then it will say both are equal

//    public boolean equals(Laptop that){
////         if(this.model == that.model && this.price==that.price){
////             return true;
////         }
////         else{
////             return false;
////         }
//        // we can return same thing in one line so don't want to use if-else.
//        return this.model == that.model && this.price==that.price; // doing same as above code
//
//    }


    // let's say ide to give me equal method because above equals() was logically wrong for that object
    // IDE generated equals() and hashcode() method
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }


    public int hashCode() {
        return Objects.hash(model, price);
    }

    // lets do same for toString method
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
}


public class ObjectClass {
    public static void main(String[] args) {
        // Laptop object 1
        Laptop obj = new Laptop();
        obj.model="Lenovo Yoga";
        obj.price=1000;

        // Laptop object 2
        Laptop obj1 = new Laptop();
        obj1.model="Lenovo Yoga";
        obj1.price=1000;

        //checking if both the object are same or not
        boolean result = obj.equals(obj1); // returning false
        boolean result2 = obj==obj1;    // also returning false
        //printing return value of comparing two class
        System.out.println(result);
        System.out.println(result2);


//        System.out.println(obj.toString()); // this line is same as line below
        System.out.println(obj); // java internally calls toString() method when we print Object
        // everytime we try to print any object behind the scene it call the toString() method of Object Class
    }
}

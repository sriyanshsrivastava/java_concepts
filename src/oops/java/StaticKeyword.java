package oops.java;

//creating a mobile class to showcase the meaning of static keyword

class Mobile{
    String brand;           //these types of variable are instance variable
    int price;

    // we can see we have common properties which is name for all the smartphone
    // now I want name variable to be common for all the object of this class so we don't have to provide value each time
    // we're creating a class we can do so by using "static" keyword in front of that variable to make it automatically available
    // for all the object of this class

//    String name; //without static keyword
    static String name;

    public void show(){     // non-static method
        System.out.println(brand+" : "+ price +" : "+name); // in Non-static method we can use static variable without any problem
    }

}

public class StaticKeyword {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand="apple";
        obj1.price=1500;
        obj1.name="Smart Phone";

        // static variable is member of the class not the object so we can also access it using class name

        System.out.println(Mobile.name); // this will also print the name property of the class which is static variable

        Mobile obj2 = new Mobile();
        obj2.brand="samsung";
        obj2.price=1700;
        obj2.name="Smart Phone";

        // we can change the static variable using any object to reflect all the object like
        obj1.name = "Phone"; // changes name property of all the object of this class

        // we can check this by printing the value of all the object

        obj1.show();
        obj2.show();

        // we can see that this changes name property of all the class despite changing in one object so static variable is
        // linked to all the object, and it resides only once in heap memory
        // Note: static variable is member of the class not the object so we can also access it using class name


    }
}

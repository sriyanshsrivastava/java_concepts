package oops.java;

// static method in class meaning and its concepts

class MobileStaticMethod{
    String brand;           //these types of variable are instance variable
    int price;
    static String name;

    public void show(){     // non-static method
        System.out.println(brand+" : "+ price +" : "+name); // in Non-static method we can use static variable without any problem
    }

        /*
        this is static method to print the details of the object,
        but we can not use non-static variable here
        because non-static variable only created after creating an object
        and static method does not know which object to call
        so we have little trick to do so
        we can take obj as argument to access its non-static / instance variable
        */


    public static void showStatic(MobileStaticMethod obj){
        System.out.println(obj.brand+" : "+ obj.price +" : "+name);  // now we can print details
    }

}



public class StaticMethods {
    public static void main(String[] args) {
        MobileStaticMethod obj1 = new MobileStaticMethod();
        obj1.brand="apple";
        obj1.price=1500;
        obj1.name="Smart Phone";

        MobileStaticMethod obj2 = new MobileStaticMethod();
        obj2.brand="samsung";
        obj2.price=1700;
        obj2.name="Smart Phone";


        obj1.show(); // non-static method only calls on object of that class
        obj2.show();
        MobileStaticMethod.showStatic(obj1); // static method can directly call from class
        MobileStaticMethod.showStatic(obj2);

        /*
         * here we can see that we can call static method using its class,
         * but we can not access instance variable so we need to pass that object
         * as argument so we can access its instance variable so we can print details of
         * that class. static method is not dependent on object its dependent on class
         * itself.
         */
    }
}

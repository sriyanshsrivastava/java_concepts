package oops.java;

//final - variable, method, class

//final implementation on class

   /*
    adding final to the class prevent extending it
    so no other class can inherit form it because it is a final class
    to demonstrate this there is code below
   */

// Class without final keyword

class Final{
//    public void show(){
//        System.out.println("in Final show()");
//    }

    public final void show(){ // final keyword in method prevent overriding
        System.out.println("By Sriyansh Srivastava");
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }
}

// same class with final keyword, and this will stop inheritance of this class

//final class Final{  // here this final will prevent other class to inherit form this class
//    public void show(){
//        System.out.println("in Final show()");
//    }
//
//    public void add(int a, int b){
//        System.out.println(a+b);
//    }
//}

// please uncomment this class so you can understand it preventing inheritance form final class

//class Extended extends Final{ // here we are not getting any error while extending this class
//     /*
//     so this class is throwing error while extending form Final class because
//     that class is declared final
//     I am commenting this because it throws error
//     to demonstrate this please uncomment this Extended class
//     it will be unable to inherit form Final class
//     */
//}

// final keyword effect on methods

class Extended extends Final{
    /* so without final keyword in parent class method
       we can override that method but, when parent class
       method  is final, it will not allow overriding
       that method in child class.
     */

    // Uncomment the code to show the error caused by final keyword in parent class method

//    public void show(){  // so this is throwing error because we can not override final method
//        System.out.println("by Satish");
//    }

}

public class FinalKeyword {
    public static void main(String[] args) {
//        int num =8;
//        num = 9; // we can do this because its not final variable and we can change num here

        // final keyword implementation on variable
        final int num =8; // final keyword make any variable constant and its not mutable
//        num =9; // this will give error because it will not assign value to num variable because its final
        System.out.println(num);// this will print 9

        Final obj = new Final();
        obj.show();
        obj.add(5,5);
    }
}

/*
 So final keyword do different thing for method variable and class,
 1. variable constant - so we can not change its value (immutable)
 2. method unoverridable - it prevent child class to override the method
 3. class unExtendable - it prevent class to inheritance by any other class
 */

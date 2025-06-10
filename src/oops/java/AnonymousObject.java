package oops.java;

class Anonymous{
    public Anonymous(){
        System.out.println("Object of Anonymous class created");
    }
    public void show(){
        System.out.println("In a show");
    }

}

public class AnonymousObject {
    public static void main(String[] args) {
        Anonymous obj = new Anonymous(); // here obj is not the Object in reality its reference variable for the object
        obj.show();  // method of Anonymous class object

        new Anonymous(); // this is anonymous object which have no any real reference variable
        new Anonymous().show(); // this work, but we can not access it same object again
    }
}
/* object without reference variable is known as
    anonymous object; we can not access it twice only one time we can access it
 */
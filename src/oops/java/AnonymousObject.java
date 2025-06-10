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
        Anonymous obj = new Anonymous();
        obj.show();
    }
}

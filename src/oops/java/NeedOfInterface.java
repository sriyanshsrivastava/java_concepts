package oops.java;

//abstract class Computer{
////    public void code(){
////
////    }
//    public abstract void code();
//}

interface Computer{
    void code();
}

class LaptopForDeveloper implements Computer{
    public void code(){
        System.out.println("Code, compile, run...");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Code, Compile, run : Faster...");
    }
}
class Developer{
    public void devApp(Computer comp){
//        System.out.println("Coding...");
        comp.code();
    }
}

public class NeedOfInterface {
    public static void main(String[] args) {
        Computer lap = new LaptopForDeveloper();
        Computer desk = new Desktop();
        Developer satish = new Developer();
        satish.devApp(lap);
    }
}

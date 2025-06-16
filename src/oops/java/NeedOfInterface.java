package oops.java;

/*
 * 💡 Why do we need interfaces in this example?
 *
 * 👉 Imagine we want a Developer class that can work with any type of computer, whether it's a Laptop or a Desktop.
 * 👉 One solution is to create a common parent class (abstract class or interface) that both LaptopForDeveloper and Desktop extend or implement.
 * 👉 Here, we chose an interface named 'Computer' because:
 *    - We want to define a contract: every Computer must have a 'code()' method.
 *    - We don't care *how* they code (Laptop and Desktop will decide that).
 *    - We want flexibility to add more types of computers in future without changing Developer code.
 *
 * ✅ The Developer class doesn't need to know whether it's using a Laptop or Desktop.
 * It just calls code() on Computer type. This is called programming to an interface — we focus on *what* can be done, not *how*.
 *
 * 🔹 Key points:
 * - The interface defines the method: void code();
 * - The implementing classes provide their own logic for code().
 * - Developer uses the interface type in devApp() so it can work with any Computer.
 *
 * 🔹 Example flow:
 * Developer devApp() → accepts Computer → can pass LaptopForDeveloper or Desktop → calls code() → runs respective logic.
 *
 * 🔹 Benefit:
 * If tomorrow we add another class like Tablet implements Computer, Developer code stays the same.
 * No changes needed in Developer class — just pass a Tablet object!
 */



//creating an abstract class because, we only need to make loose coupled code

//abstract class Computer{
////    public void code(){
////
////    }
//    public abstract void code();
//}

// using interface instead of abstract class. to achieve same goal.
interface Computer{
    void code();
}

// laptop class implementing Computer interface
class LaptopForDeveloper implements Computer{
    public void code(){
        System.out.println("Code, compile, run...");
    }
}

// Desktop class implementing Computer interface
class Desktop implements Computer{
    public void code(){
        System.out.println("Code, Compile, run : Faster...");
    }
}

// Developer class
class Developer{
    public void devApp(Computer comp){
//        System.out.println("Coding...");
        comp.code();
    }
}

public class NeedOfInterface {
    public static void main(String[] args) {
        // making Computer type of object of LaptopForDeveloper class.
        Computer lap = new LaptopForDeveloper();

        // making Computer type of object of Desktop class.
        Computer desk = new Desktop();

        // Making developer object satish

        Developer satish = new Developer();
        satish.devApp(lap);
        satish.devApp(desk);
    }
}

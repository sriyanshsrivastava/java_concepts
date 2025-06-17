package oops.java;

/*
 * 💡 Concept: enum with constructor, getter, setter in Java
 *
 * 👉 What is enum?
 * - Enum defines a fixed set of constants.
 * - Example: Macbook, XPS, Surface, ThinkPad → all are laptops with predefined names.
 * - We can attach properties (like price) and behavior (methods) to each constant.
 *
 * 👉 Why constructor in enum?
 * - When we want each enum constant to carry data (e.g., price), we can pass it via constructor.
 * - Just like a class, enum can have constructors, fields, methods.
 * - Constructor in enum is **always private** (or package-private by default). Java enforces this to prevent creating new constants at runtime.
 *
 * 👉 In this code:
 * - We have two constructors:
 *    1️⃣ A default constructor (no-arg) → assigns default price (500) if no price specified.
 *    2️⃣ A parameterized constructor → sets price as provided.
 *
 * - Macbook(2000), XPS(2200), ThinkPad(1800) → call parameterized constructor.
 * - Surface() → calls default constructor as no price is provided.
 *
 * - The `System.out.println` inside constructors shows which constructor runs for which constant.
 *
 * 👉 Why getter and setter?
 * - `getPrice()` lets us retrieve price of the enum constant.
 * - `setPrice()` (though unusual for enum) allows price to change at runtime (but typically enum constants are immutable).
 *
 * 👉 Why default constructor needed here?
 * - If you define only parameterized constructor → Java disables default constructor.
 * - If any enum constant doesn't pass parameter (Surface()), code will fail unless you define explicit no-arg constructor → that’s why we wrote it.
 *
 * 👉 Looping through enum values:
 * - `LaptopEnum.values()` → returns array of all enum constants.
 * - Useful to print or process all constants dynamically.
 *
 * 🔹 Final code behavior:
 * - When enum loads, constructor runs for each constant.
 * - Then main prints Macbook price, then all constants with their prices.
 *
 * ✅ Summary:
 * This code shows how to give each enum constant its own property, how constructors work in enums, and how to access the data.
 */

enum LaptopEnum{
    //Macbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);
    // what if i don't specify all the price here like below ?
    Macbook(2000), XPS(2200), Surface(), ThinkPad(1800);
    // this will throw error because it has only one constructor, and it is parameterised
    // so we have to make a default constructor so it does Instantiate without a parameter.
    // Let's do it above parameterised constructors.

    private int price;

    // default constructors does not take any parameter as stated above in the comment
    private LaptopEnum(){
        this.price= 500;
        System.out.println("In Laptop Without price "+ this.name());
    }

    // parameterised constructor it takes price to Instantiate the object of enum class
    // this below code will run three (3) time and default will run one time
    // to demonstrate lets print a line in parameterised constructor
    // we already had a default constructor but when we define a parameterised constructor default constructor get
    // disabled, and we have to enable it by defining it deliberately. like we are doing above.
    private LaptopEnum(int price) {
        this.price = price;
        System.out.println("In Laptop with Price " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumConstructors {
    public static void main(String[] args) {
        // Printing name and price of object of LaptopEnum.
        LaptopEnum lap = LaptopEnum.Macbook;
        System.out.println(lap+" : "+lap.getPrice());

        // printing all the name and price by enhanced for loop.
        for(LaptopEnum obj:LaptopEnum.values()){
            System.out.println(obj + " : "+ obj.getPrice());
        }

    }
}

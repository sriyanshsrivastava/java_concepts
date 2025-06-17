package oops.java;

/*
 * 💡 What is enum in Java?
 *
 * 👉 Enum (short for "enumeration") is a special data type that lets us define a set of **named constants**.
 * 👉 Useful when a variable should have only a fixed set of possible values.
 * 👉 Example: Days of the week, directions (NORTH, SOUTH), status codes (SUCCESS, FAILURE), etc.
 *
 * 👉 Why use enum instead of constants or strings?
 *    - Improves readability — names are meaningful, not just random numbers or strings.
 *    - Type safety — compiler ensures the variable can only have allowed values (no typos like "Frday" instead of "Friday").
 *    - Can have fields, constructors, and methods (unlike simple constants).
 *
 * 🔹 Example:
 * enum Day {
 *     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
 * }
 *
 * class Test {
 *     Day today = Day.MONDAY;
 *
 *     void display() {
 *         if (today == Day.MONDAY) {
 *             System.out.println("Start of the week!");
 *         }
 *     }
 * }
 *
 * ✅ Benefit:
 * - Makes code more structured and error-free.
 * - Easy to maintain if we need to change or extend allowed values.
 */


import java.sql.SQLOutput;

enum Status{
    // by default enum is extended to Enum class of java.
    // we can not extend enum class to any other enum , class and interface.

    Running, Failed, Pending, Success
    //These all are objects of Enum class Status
    // these are nothing but "Named Constants".
}


public class EnumConcept {
    public static void main(String[] args) {

        Status s = Status.Failed;
        System.out.println(s);

        // printing all the values in enum class
        Status[] st = Status.values(); // .values() return array so we have to accept it as array
        System.out.println(st[2]);

        // Looping through all enums.
        for (Status ss : Status.values()) {
            System.out.println(ss);
        }

        // we can also check conditional statements

        Status obj = Status.Pending;

        if (obj == Status.Success) {
            System.out.println("Done.");
        } else if (obj == Status.Failed) {
            System.out.println("Please Try again.");
        } else if (obj == Status.Running) {
            System.out.println("All good.");
        } else {
            System.out.println("Result is on the way, Please Wait.");
        }

        // we can use switch statement for better implementation than if-else condition

        Status obj1 = Status.Pending;

        switch (obj1) {
            case Running:
                System.out.println("All Good.");
                break;

            case Failed:
                System.out.println("Please try Again.");
                break;

            case Pending:
                System.out.println("Hold tight, on the way, Please wait.");
                break;

            default:
                System.out.println("Congratulations, Its Done.");
                break;
        }

        System.out.println(obj1.getClass().getSuperclass()); // printing super class of enum
    }
}

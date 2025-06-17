package oops.java;

/*
 * 💡 Exception Handling in Java:
 *
 * 👉 Exceptions are unexpected events that disrupt normal program flow (e.g., division by zero, file not found).
 * 👉 Java provides a robust way to handle these using try-catch-finally blocks to prevent program crashes.
 *
 * 🔹 Keywords:
 * - try: Block where code that might throw an exception is placed.
 * - catch: Block to handle the exception type you want to catch.
 * - finally: (optional) Block that always executes (for cleanup code like closing files).
 * - throw: Used to explicitly throw an exception.
 * - throws: Declares exceptions a method might throw, to be handled by the caller.
 *
 * Example:
 * try {
 *     int result = 10 / 0;  // This will cause ArithmeticException
 * } catch (ArithmeticException e) {
 *     System.out.println("Cannot divide by zero!");
 * } finally {
 *     System.out.println("This block always runs.");
 * }
 *
 * 📌 Why handle exceptions?
 * - To make programs more reliable and prevent abrupt termination.
 * - To provide meaningful messages to users when something goes wrong.
 */


public class ExceptionHandling {
    public static void main(String[] args) {

        int i =5;
        int j =2;

        int[] nums = new int[5];
        String str = null;


        try{
            int result = i/j; // this will cause ArithmeticException
            System.out.println(result);
            System.out.println(nums[1]);
            System.out.println(nums[3]);
            System.out.println(str.length()); // we can not calculate length of null String.

        } catch(ArithmeticException e){ // Handling ArithmeticExceptions only ArithmeticException will be caught here.
            System.out.println("Can not Divide by Zero- " + e);

        } catch (ArrayIndexOutOfBoundsException e){ // similarly for ArrayIndexOutOfBoundsException.
            System.out.println("Stay in your limit- " + e);

        } catch (Exception e){ // this will handle all the exception independent of its type.
             /*
             Handles all the Exception not Caught above because it parents class of all the Exceptions.
             we should always state this below all the child class exceptions because if we use on top of it
             is will catch all types of exception and below catch block will never be executed. think this as
             it super of all it can handle all the expression if we mention it on above of all exception none of
             exceptions will go down all will be handled by this class only.
             */
            System.out.println("Something went wrong- "+ e);

        } finally {
            // we should put statements which we finally wants to run independent of their exceptions.
            System.out.println("This will print at any cost.");
        }

        System.out.println("Bye"); // this code will run anyway independent of Exception Accrued or not.

    }
}

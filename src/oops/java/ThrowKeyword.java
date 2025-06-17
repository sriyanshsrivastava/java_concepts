package oops.java;

/*
 * 💡 The `throw` keyword in Java:
 *
 * 👉 `throw` is used to **explicitly create and throw an exception object** at runtime.
 * 👉 It transfers control to the nearest matching catch block or terminates the program if uncaught.
 * 👉 Syntax: throw new ExceptionType("Error message");
 *
 * Example:
 * throw new ArithmeticException("Division by zero is not allowed");
 *
 * 🔹 Note:
 * - You can throw both checked and unchecked exceptions.
 * - When throwing a **checked exception**, the method must declare it using `throws`.
 *
 * Example:
 * void myMethod() throws IOException {
 *     throw new IOException("File not found");
 * }
 */

// Writing custom Exception
class SriyanshException extends Exception{
    public SriyanshException(String str){
        super(str);
    }
}


public class ThrowKeyword {
    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        try{
            j=18/i;
            // throwing exception based on condition, like when j == 0, it throws exception.
            if(j==0){
//                throw new ArithmeticException("I don't want to print 0");
                throw new SriyanshException("I am printing my personal Exception Message");
            }

        }catch (SriyanshException e){

            j=18/1; // handling exception with a default output if ArithmeticException accrues.
            System.out.println("that's the default output "+ e);

        } catch (Exception e) {
            System.out.println("Something went Wrong");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}

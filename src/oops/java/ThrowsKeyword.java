package oops.java;

/*
 * 💡 The `throws` keyword in Java:
 *
 * 👉 `throws` is used in a method signature to **declare exceptions** that the method might throw.
 * 👉 It tells the caller of the method: "I might throw this exception, so handle it!"
 * 👉 Mainly used for **checked exceptions** (e.g., IOException, SQLException).
 *
 * Syntax:
 * returnType methodName() throws ExceptionType1, ExceptionType2 {
 *     // method body
 * }
 *
 * 🔹 Example:
 * void readFile() throws IOException {
 *     // code that might throw IOException
 * }
 *
 * 🔹 Note:
 * - Multiple exceptions can be declared, separated by commas.
 * - `throws` provides compile-time checking of exception handling.
 */

class T{
    // throws keyword is sending responsibility to the method which is calling the show() Method of this class,
    // which is main function of the ThrowsKeyword Class.
    public void show() throws ClassNotFoundException{
        // Class.forName("oops.java.A"); oops.java.A is present in the package so it will not throw Exception.
        Class.forName("Calc"); // this class is not present anywhere in the file so it throws exception.
    }
}

public class ThrowsKeyword {
    public static void main(String[] args) {
        T obj = new T();

        // we have to handle here because show() method is given responsibility to the method which is calling him.
        try { // try catch block to handle ClassNotFoundException of the show() method of Class T
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // print all the log which method is calling which.
        }
    }
}

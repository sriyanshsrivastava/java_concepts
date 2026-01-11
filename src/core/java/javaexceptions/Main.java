package core.java.javaexceptions;

/*
* Exception is an event that disrupts the normal flow of the program.
* it is an object which is thrown at runtime
*
* */

public class Main {
    public static int divide(int a,int b){
        // handling exception divide by zero error using try catch block;
        try{
            return a/b;
        }catch (ArithmeticException e){
            System.out.println(e);
            return -1;
        }

    }
    public static void main(String[] args) {
        int[] numerators = {10,200,30,40};
        int[] denominator = {1,2,0,4};
        for(int i = 0; i<numerators.length;i++){
            System.out.println(divide(numerators[i],denominator[i]));  // this line will throw an divide by zero error
        }
        System.out.println("Good job ...");
    }


}

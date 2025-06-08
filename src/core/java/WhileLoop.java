package core.java;

public class WhileLoop {
    public static void main(String[] args) {

//        int i = 1;                       //counter
//        while(i<=5)                      // check condition
//        {
//            System.out.println("Hi "+i); //do something as You want
//            i++;                         //increment the value of i by 1 after every loop
//        }
//
//        System.out.println("Bye "+ i);

        int i = 1;                       //counter
        while(i<=5)                      // check condition
        {
            System.out.println("Hi "+i); // Do something as you want
            int j =1;                       // another counter variable for inner while loop
            while(j<=3){                    //nested while loop
                System.out.println("Hello "+j);
                j++;
            }

            i++;                         //increment the value of i by 1 after every loop
        }

        System.out.println("Bye "+ i);




    }
}

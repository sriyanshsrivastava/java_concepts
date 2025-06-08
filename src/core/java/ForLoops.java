package core.java;

public class ForLoops {
    public static void main(String[] args) {
        // Normal for loop

        for(int i=1;i<=4;i++){
            System.out.println("Hi " + i);
        }

        // For loop starting form 0

        for(int i=0;i<4;i++){
            System.out.println("Hi " + i);
        }

        // Nested-for loop

        for (int i =1;i<=5;i++){ //outer for loop
            System.out.println("DAY "+i);
            for(int j=1;j<=9;j++){  //inner for loop
                System.out.println("    "+(j+8)+" - "+(j+9));
            }
        }

        // One more way to achieve this for loop it will give no error

        int i =1; // initialising counter outside the for syntax
        for (;i<=5;){ //we can define variable outside and increment it inside the loop,
                      // only thing to keep in mind is we have to use 2 semicolon
            System.out.println("DAY "+i);
            i++;       //incrementing outside the for loop syntax
//            for(int j=1;j<=9;j++){  //inner for loop
//                System.out.println("    "+(j+8)+" - "+(j+9));
//            }
        }

    }
}

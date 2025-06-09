package core.java;

public class ArrayCreation {
    public static void main(String[] args) {

        // Array is very important concept in java it is widely used everywhere

        // 1.Array creation and assigning value if it is finite and know which number to store
        int nums[] = {5,6,7}; // array initialisation and assigning three value 5,6,7
        //fetching value
        System.out.println(nums[0]); //indexing start from '0'

        // 2.Creating Dynamic array when values is not known
//        int numbers[]=new int[4]; // Syntax type 1
        int[] numbers = new int[4]; // Syntax 2
        // Assigning the value, by default all the value will 0;
        numbers[0]=4;
        numbers[1]=8;
        numbers[2]=3;
        numbers[3]=9;

        System.out.println(numbers[1]); // but difficult to fetch all the value for 4 value we have to sout all the value again and again

        // for loop to fetch all the value at once
        for(int i=0;i<4;i++){
            System.out.println(numbers[i]);
        }

        // 3.Multidimensional array Creation

        int[][] twodimentionalarray=new int[3][4];
        // let assign all the value using Random function of Math class to keep it easy

        for(int i=0; i<3;i++){
            for(int j=0;j<4;j++){
                twodimentionalarray[i][j]=(int)(Math.random()*10);
            }
        }

        // Printing value in matrix form
        for(int i=0; i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(twodimentionalarray[i][j]+" ");
            }
            System.out.println();
        }

        // Printing value using Enhanced For loop
        for(int n[]:twodimentionalarray){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }

        // 4. jagged array (means i want to store any number array in the multidimensional array)
        // I don't know the number of values inside the inner array

        int[][] jaggednums=new int[3][]; // we don't specify the number of items in inner array
        // but we have to specify the numbers of item in each rows or items of outer array
        jaggednums[0]=new int[3];
        jaggednums[1]=new int[4];
        jaggednums[2]=new int[2];

        // assigning the value to jagged array
        for(int i=0;i<jaggednums.length;i++){
            for(int j=0;j<jaggednums[i].length;j++){
                jaggednums[i][j]= (int)(Math.random()*100);
            }
        }
        // Printing the value
        for(int n[]:jaggednums){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }

        /* we can create any dimensional array just we have to increase square bracket at
        * declaration like three-dimensional array of integer will look like
        * int[][][] three-dimensional array = new int[][][] */

    }
}

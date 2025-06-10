package oops.java;
// here we can see AdvCalc is a Calc
public class AdvCalc extends Calc { // here AdvCalc is called subclass and Calc called super class
                                    // and this AdvCalc is extending to Calc class means we can use all the
                                    // methods present in super class on the object of subclass
                                    // you can see the code in inheritance class file
    public int multi(int n1, int n2){
        return  n1*n2;
    }
    public int div(int n1, int n2){
        return  n1/n2;
    }
}

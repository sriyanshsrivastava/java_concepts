package oops.java;

public class VeryAdvCalc extends AdvCalc { // now we can see VeryAdvCalc is extending to AdvCalc
                                            // and AdvCalc is extending Calc so we can say we are having
                                            // multi level inheritance Calc -> AdvCalc -> VeryAdvCalc
    public int power(int x, int n){
        return (int)Math.pow(x,n);
    }
}

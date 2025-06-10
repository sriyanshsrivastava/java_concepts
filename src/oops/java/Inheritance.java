package oops.java;

public class Inheritance {
    public static void main(String[] args) {
//        Calc obj = new Calc();   // Calc object have 2 method
//        AdvCalc obj = new AdvCalc(); // AdvCalc have 2+2 method 2 form Calc class and 2 form his own class
        VeryAdvCalc obj = new VeryAdvCalc(); // VeryAdvCalc have total 5 method 2+2+1 so it can use all the method of
                                             // his parent and grandparent class or super class
        int r1 = obj.add(4,5);
        int r2 = obj.sub(7,3);
        int r3 = obj.multi(5,3);
        int r4 = obj.div(6,3);
        int r5 = obj.power(4,2);

        System.out.println(r1 + " " +r2+" "+r3 + " " +r4 + " " + r5);
    }
}

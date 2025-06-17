package oops.java;

class Th1 extends Thread{
    public void run(){
        for (int i=1;i<=100;i++) {
            System.out.println("Hi");
            try{
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
class Th2 extends Thread{
    public void run(){
        for (int i=1;i<=100;i++) {
            System.out.println("Hello");
            try{
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadsConcepts {
    public static void main(String[] args) {
        Th1 obj1 = new Th1();
        Th2 obj2 = new Th2();

        obj1.start();
        try{
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();

    }
}

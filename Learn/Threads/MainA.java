// package Threads;


class A extends Thread{

    public void run(){
        // System.out.println("Hi");

        for(int i = 0; i < 10; i++){
            System.out.println("Hi " + i);
            // System.out.println();
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{

    public void run(){
       
        for(int i = 0; i < 10; i++){
            System.out.println("Hello " + i);
            // System.out.println();
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


public class MainA {
    public static void main(String[] args) {
        
        A a = new A();
        B b = new B();

        // a.show();
        // b.show();

        // System.out.println(a.getPriority());

        // b.setPriority(Thread.MAX_PRIORITY);

        a.start();
        try {
            Thread.sleep(5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        b.start();
    }
}

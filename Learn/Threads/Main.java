// package Threads;


class A extends Thread{

    public void run(){
        // System.out.println("Hi");

        for(int i = 0; i < 10; i++){
            System.out.println("Hi " + i);
            System.out.println();
        }
    }
}

class B extends Thread{

    public void run(){
       
        for(int i = 0; i < 10; i++){
            System.out.println("Hello " + i);
            System.out.println();
        }
    }
}


public class Main {
    public static void main(String[] args) {
        
        A a = new A();
        B b = new B();

        // a.show();
        // b.show();

        a.start();
        b.start();
    }
}

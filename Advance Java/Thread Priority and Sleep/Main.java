// package Thread Priority and Sleep;


class A extends Thread{

    public void run(){

        for(int i = 1; i <= 10; i++){
            System.out.println("Hi");
            
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class B extends Thread{

    public void run(){

        for(int i = 1; i <= 10; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        
        A a = new A();
        B b = new B();

        // System.out.println(a.getPriority());

        // b.setPriority(10);

        a.start();
        try {
            Thread.sleep(5);
        } catch (Exception e) {
            System.out.println(e);
        }
        b.start();
    }
}

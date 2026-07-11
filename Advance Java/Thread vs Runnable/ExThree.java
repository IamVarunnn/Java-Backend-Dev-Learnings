// package Thread vs Runnable;


class Employee{

}

class Manager extends Employee implements Runnable{

    public void run(){
        System.out.println("Managing");
    }
}

class Developer extends Employee implements Runnable{

    public void run(){
        System.out.println("Developing");
    }
}

class Tester extends Employee implements Runnable{

    public void run(){
        System.out.println("Testing");
    }
}

public class ExThree {
    public static void main(String[] args) {
        
        Runnable manager = new Manager();
        Runnable developer = new Developer();
        Runnable tester = new Tester();


        Thread t1 = new Thread(manager);
        Thread t2 = new Thread(developer);
        Thread t3 = new Thread(tester);

        t1.start();
        t2.start();
        t3.start();
    }
}

// package Thread vs Runnable;


class Vehicle{
    
}

class Car extends Vehicle implements Runnable{

    public void run(){
        System.out.println("Car Running");
    }
}

class Bike extends Vehicle implements Runnable{
    public void run(){
        System.out.println("Bike Running");
    }
}

public class ExTwo {
    public static void main(String[] args) {
        
        Runnable car = new Car();
        Runnable bike = new Bike();

        Thread t1 = new Thread(car);
        Thread t2 = new Thread(bike);

        t1.start();
        t2.start();
    }
}

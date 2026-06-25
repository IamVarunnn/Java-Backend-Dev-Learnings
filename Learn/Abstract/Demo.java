
abstract class Car{
    public abstract  void drive();
    // public abstract  void fly();

    public  void playMusic(){
        System.out.println("Play Music");
    }
}


class Wagon extends Car{

    public void drive(){
        System.out.println("I am driving");
    }
}

public class Demo{
    public static void main(String[] args) {
        
        // Car car = new Car();
        Car wag = new Wagon();

        // car.playMusic();
        wag.drive();
    }
}
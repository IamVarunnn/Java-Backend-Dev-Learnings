abstract class Car{

    public abstract void drive();

    public void playMusic(){
        System.out.println("Play Music");
    }
}

class WagonR extends Car{

    

    public void drive(){
        System.out.println("Driving");
    }
}

class Main{
    public static void main(String[] args) {
    
        Car car = new WagonR();

        car.drive();
        car.playMusic();
    }
}
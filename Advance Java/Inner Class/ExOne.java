// package Inner Class;

class Car{
    String brand;

    Car(String brand){
        this.brand = brand;
    }

    class Engine{

        int tyre;
        String engineType;

        Engine(int tyre, String engineType){
            this.tyre = tyre;
            this.engineType = engineType;
        }

        public void showDetails(){
            System.out.println(brand);
            System.out.println(this.tyre);
            System.out.println(this.engineType);
        }
        
    }
}

public class ExOne {
    public static void main(String[] args) {
        
        Car ford = new Car("Ford");

        Car.Engine eng = ford.new Engine(4, "%hours");

        eng.showDetails();
    }
}

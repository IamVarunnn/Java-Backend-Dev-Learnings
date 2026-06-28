
enum Laptop{
    Macbook(200), XPS, Surface(150), ThinkPad(180);

    private Laptop() {

        price = 50;
    }


    

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    
}

public class bemo {
    public static void main(String[] args) {
        
        // Laptop lap = Laptop.Macbook;

        // System.out.println(lap.getPrice());

        for(Laptop lap : Laptop.values()){
            System.out.println(lap + ":"+ lap.getPrice());
        }
    }    
}

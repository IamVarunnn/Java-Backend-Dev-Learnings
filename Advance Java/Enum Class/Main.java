
enum Laptop{
    MSI(100), Macbook(200), Dell, ThinkPad(80);

    private int price;

    private Laptop(){
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    
}

class Main{
    public static void main(String[] args) {
        
        // Laptop lap = Laptop.Dell;
        // System.out.println(lap.getPrice());

        for(Laptop lap : Laptop.values()){
            System.out.println(lap + ":" + lap.getPrice());
        }
    }
}
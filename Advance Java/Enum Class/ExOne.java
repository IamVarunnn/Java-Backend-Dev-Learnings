// package Enum Class;

enum Size{

    SMALL(500), MEDIUM(700), LARGE(900);

    private int price;

    private Size(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}


class TShirt{
    int id;
    String brand;
    Size size;

    public TShirt(int id, String brand, Size size) {
        this.id = id;
        this.brand = brand;
        this.size = size;
    }

    public void display() {
        System.out.println("Id : " + id);
        System.out.println("Brand : " + brand);
        System.out.println("Size : " + size);
        System.out.println("Price : " + size.getPrice());
    }
}

public class ExOne {
    public static void main(String[] args) {
        
        TShirt small = new TShirt(1, "HRX", Size.SMALL);
        TShirt medium = new TShirt(3, "HRX", Size.MEDIUM);
        TShirt large = new TShirt(2, "HRX", Size.LARGE);

        small.display();
        medium.display();
        large.display();
    }
}

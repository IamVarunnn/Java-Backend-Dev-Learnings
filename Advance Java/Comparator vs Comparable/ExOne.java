
class Product implements Comparable<Product>{
    int id;
    int price;

    public Product(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public int compareTo(Product pro){

        if(this.price > pro.price){
            return 1;
        }
        else{
            return -1;
        }
    }
}

public class ExOne {
    public static void main(String[] args) {
        
    }   
}

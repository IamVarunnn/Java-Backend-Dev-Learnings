
import java.util.Arrays;
import java.util.List;

// package Constructor Reference;

class Product{

    String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + "]";
    }

    
}

public class ExThree {
    public static void main(String[] args) {
        
        List<String> products = Arrays.asList("Laptop", "Mouse", "Keyboard");

        List<Product> ls = products.stream()
                        .map(Product :: new)
                        .toList();

        System.out.println(ls);


    }
}

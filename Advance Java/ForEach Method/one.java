
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// package ForEach Method;

public class one {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Ajay", "Karan");



        Consumer<String> c = new Consumer<String>() {
            
            public void accept(String s){
                System.out.println("Hello " + s);
            }
        };


        names.forEach(c);

         List<Integer> ls = Arrays.asList(1, 2, 3, 5);



        Consumer<Integer> cn = new Consumer<Integer>() {
            
            public void accept(Integer s){
                System.out.println("Number " + s);
            }
        };


        ls.forEach(cn);


    }
}

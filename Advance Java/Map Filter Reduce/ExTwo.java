
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

// package Map Filter Reduce;

public class ExTwo {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("alex", "bob", "carry", "john");

        Predicate<String> p = new Predicate<String>(){

            @Override
            public boolean test(String t) {
                 
                return t.length() > 3;
            }
            
        };


        Function<String, String> fun = new Function<String, String>(){

            @Override
            public String apply(String t) {
                
                return t.toUpperCase();
            }
        };


        Stream<String> str = names.stream()
                            .filter(p)
                            .map(fun)
                            .sorted();


        str.forEach(n -> System.out.println(n));
    }
}

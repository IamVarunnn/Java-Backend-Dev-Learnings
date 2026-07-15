import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Alex", "Bob", "Carry", "Don");


        // List<String> upperNames = names.stream()
        //                             .map(s -> s.toUpperCase())
        //                             .toList();

        // System.out.println(upperNames);

        List<String> upperNames = names.stream()
                                    .map(String :: toUpperCase)
                                    .toList();
        
        // System.out.println(upperNames);

        // upperNames.forEach(s -> System.out.println(s));
        upperNames.forEach(System.out :: println);
        
    }
}

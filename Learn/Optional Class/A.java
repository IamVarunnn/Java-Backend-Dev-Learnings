// package Optional Class;

import java.util.Arrays;
import java.util.List;

public class A {
    public static void main(String[] args) {
        

        List<String> ls = Arrays.asList("Navin", "Lazy", "John", "Kishore");

        // Optional<String> name = ls.stream()
        //             .filter(str -> str.contains("x"))
        //             .findFirst();

        String name = ls.stream()
                    .filter(str -> str.contains("x"))
                    .findFirst()
                    .orElse("Not Found");

        System.out.println(name);
    }
}

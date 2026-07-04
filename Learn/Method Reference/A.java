// package Method Reference;

import java.util.Arrays;
import java.util.List;

public class A {
    public static void main(String[] args) {


        List<String> names = Arrays.asList("Navin", "Harsh", "John");

        // List<String> uNames = names.stream()
        //                         .map(name -> name.toUpperCase())
        //                         .toList();

        List<String> uNames = names.stream()
                                .map(String::toUpperCase)
                                .toList();

        // System.out.println(uNames);

        uNames.forEach(i -> System.out.println(i));
        uNames.forEach(System.out :: println);

            
    } 
}

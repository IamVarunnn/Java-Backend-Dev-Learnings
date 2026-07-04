// package Stream API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class A {

    public static void main(String[] args) {
        

        List<Integer> nums = Arrays.asList(1, 4, 6, 5, 7, 2);

        Predicate<Integer> p =  n -> n % 2 == 0;
        
        Function<Integer, Integer> fun =  n -> n * 2;

        // int res =  nums.stream()
        //     .filter(p)
        //     .map(fun)
        //     .reduce(0, (c, e) -> (c + e));

        // System.out.println(res);

        Stream<Integer> sortedVal = nums.stream()
            .filter(p)
            .sorted();

        // System.out.println(sortedVal);
        sortedVal.forEach(n -> System.out.println(n));
    }
    
}

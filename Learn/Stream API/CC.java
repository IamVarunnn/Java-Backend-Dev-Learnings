// package Stream API;

import java.util.Arrays;
import java.util.List;

public class CC {

    public static void main(String[] args) {
        

        List<Integer> nums = Arrays.asList(1, 4, 6, 5, 7, 2);

        // Stream<Integer> s1 = nums.stream();

        // Stream<Integer> s2 = s1.filter((n -> n % 2 == 1));
        
        // Stream<Integer> s3 = s2.map(n -> (n * n));

        // s2.forEach(n -> System.out.println(n));
        // s3.forEach(n -> System.out.println(n));

        // int res =  s3.reduce(0, (c, e) -> c + e);
        
        // System.out.println(res);
        // s1.forEach(n -> System.out.println(n));
        // s1.forEach(n -> System.out.println(n));


        int res =  nums.stream()
            .filter((n) -> (n % 2 == 1))
            .map(n -> (n + 2))
            .reduce(0, (c, e) -> (c + e));

        System.out.println(res);
    }
    
}

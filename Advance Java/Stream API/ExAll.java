import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExAll {
    
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        Stream<Integer> sum = nums.stream();


        int val = sum
                .filter(n -> n % 2 == 0)
                .map(n -> n * 10)
                .reduce(0, (s, e) -> (s + e));

        System.out.println(val);


        List<Integer> arr = Arrays.asList(3,4,5,6,7,8);

        Stream<Integer> sol = arr.stream();

        int val2 = sol
                .filter(n -> n > 5)
                .map(n -> n + n)
                .reduce(0, (s, e) -> (s + e));

        System.out.println(val2);
        
    }
}

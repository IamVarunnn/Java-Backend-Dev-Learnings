import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExTwoMap {

    public static void main(String[] args) {
        

        List<Integer> nums = Arrays.asList(1,2,3,4,5);


        Stream<Integer> s1 = nums.stream();

        Stream<Integer> s2 = s1.map(n -> n * 2);


        s2.forEach(n -> System.out.println(n));

        List<String> names = Arrays.asList("alex","john","bob");


        Stream<String> l1 = names.stream();

        Stream<String> l2 = l1.map(n -> n.toUpperCase());

        l2.forEach(k -> System.out.println(k));
    }
    
}

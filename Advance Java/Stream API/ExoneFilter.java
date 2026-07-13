import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExoneFilter {
    public static void main(String[] args) {
        

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8);

        Stream<Integer> s1 = nums.stream();

        Stream<Integer> s2 = s1.filter(n -> n % 2 == 1);

        s2.forEach(n -> System.out.println(n));


        List<String> names = Arrays.asList("Alex","Bob","Carry","John");

        Stream<String> n1 = names.stream();

        Stream<String> n2 = n1.filter(n -> n.length() > 2);

        n2.forEach(n -> System.out.println(n));
    }
}

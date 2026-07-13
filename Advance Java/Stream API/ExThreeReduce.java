import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExThreeReduce {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5);


        Stream<Integer> s = nums.stream();

        int val = s.reduce(1, (k, e) -> (k + e));

        System.out.println(val);

        List<Integer> arr = Arrays.asList(2,3,4);

        Stream<Integer> r = arr.stream();

        int pro = r.reduce(1, (l, f) -> (l * f));

        System.out.println(pro);



    }
}

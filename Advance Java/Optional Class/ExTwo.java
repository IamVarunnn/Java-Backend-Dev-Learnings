import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExTwo {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(3,5,6,7,8,9,101);

        Optional<Integer> val = nums.stream()
                                .filter(n -> n % 2 == 0)
                                .findFirst();

        
        System.out.println(val.orElse(-1));

        int ele = nums.stream()
                    .filter(n -> n % 2 == 0)
                    .findFirst()
                    .orElse(-1);

        
        System.out.println(ele);
    }
}

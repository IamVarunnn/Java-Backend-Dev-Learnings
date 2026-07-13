import java.util.Arrays;
import java.util.List;

public class one {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
            "Varun",
            "Arjun",
            "Rahul",
            "Kiran"
        );


        names.forEach(name -> System.out.println("Hello " + name));

        List<Integer> nums = Arrays.asList(
            10, 15, 20, 25, 30
        );

        nums.forEach(n -> System.out.println(n));
    }
}

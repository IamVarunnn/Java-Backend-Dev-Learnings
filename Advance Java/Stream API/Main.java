import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        

        List<Integer> nums = Arrays.asList(4, 5, 6, 8, 9, 7);

        System.out.println(nums);
        System.out.println(nums);


        // Stream<Integer> s1 = nums.stream();

        // // s1.forEach(n -> System.out.println(n));
        // // The below code wont work because its already used above
        // // s1.forEach(n -> System.out.println(n));



        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);

        // // s2.forEach(n -> System.out.println(n));

        // Stream<Integer> s3 = s2.map(n -> n + n);

        // // s3.forEach(n -> System.out.println(n));

        // int n = s3.reduce(0, (c, e) -> c + e);

        // System.out.println(n);



        int ans = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n + n)
                .reduce(0, (s, e) -> (s + e));


        System.out.println(ans);




        
    }
}

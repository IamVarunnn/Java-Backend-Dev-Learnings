import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Main{
    public static void main(String[] args) {
        


        List<Integer> nums = Arrays.asList(1, 3, 4, 5, 9, 8);

        // Predicate<Integer> p = new Predicate<Integer>() {
        //     @Override
        //     public boolean test(Integer t) {
                
        //         if(t % 2 == 0){
        //             return true;
        //         }
        //         else{
        //             return false;
        //         }
        //     }
            
            
        // };

        // Predicate<Integer> p = n -> n % 2 == 1;


        // Function<Integer, Integer> fun = new Function<Integer,Integer>() {
        //     @Override
        //     public Integer apply(Integer t) {
        //         throw new UnsupportedOperationException("Not supported yet.");
        //     }
            
            
        // };


        // Function<Integer, Integer> fun = n -> n * 2;






        // int res = nums.stream()
        //             .filter(p)
        //             .map(fun)
        //             .reduce(0, (s,e) -> s + e);



        Stream<Integer> sorted = nums.stream()
                                .filter(n -> n % 3 == 1)
                                .sorted();

        
        sorted.forEach(n -> System.out.println(n));
    }
}
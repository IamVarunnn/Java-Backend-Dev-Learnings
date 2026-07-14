
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

// package Map Filter Reduce;

public class ExOne {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(7,2,9,4,1,8);

        Predicate<Integer> p = new Predicate<Integer>() {

            public boolean test(Integer t) {
                return t > 4;
            }

        };


        Function<Integer, Integer> fun = new Function<Integer, Integer>(){
            @Override
            public Integer apply(Integer t) {
                
                return t * 3;
            }

        };

        Comparator<Integer> com = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub

                if(o1 < o2){
                    return 1;
                }
                else{
                    return -1;
                }

            }
            
            
        };


        Stream<Integer> ls = nums.stream()
                            .filter(p)
                            .map(fun)
                            .sorted(com);

        ls.forEach(n -> System.out.println(n));
    }
}

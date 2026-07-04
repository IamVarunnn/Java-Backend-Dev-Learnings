// package Stream API;

import java.util.Arrays;
import java.util.List;

public class AA {
    public static void main(String[] args) {
        
        List<Integer> ls = Arrays.asList(1, 2, 4, 5, 7);

        // System.out.println(ls);

        // int sum = 0;

        // for(int it : ls){

        //     if((it & 1) == 1){
        //         it += 2;
        //         sum += it;
        //     }
        // }

        // System.out.println(sum);

        ls.forEach(n -> System.out.println(n));
 
    }
}

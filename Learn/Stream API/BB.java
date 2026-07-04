// package Stream API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class BB {
    public static void main(String[] args) {
        

        List<Integer> ls = Arrays.asList(1, 2, 4, 5, 6, 7);

        // Consumer<Integer> com = new Consumer<Integer>() {
            
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };

        // Consumer<Integer> com =  (Integer n)->{
        //         System.out.println(n);
        //     };

        Consumer<Integer> com =  (n)->{ System.out.println(n); };

        ls.forEach(com);
    }
}

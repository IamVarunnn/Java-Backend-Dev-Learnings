// package ForEach Method;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 4, 8, 5, 7, 6);

        // Consumer<Integer> coms = new Consumer<Integer>() {
            
        //     public void accept(Integer i){

        //         System.out.println(i);
        //     }
        // };

        // Consumer<Integer> com = (Integer i) -> System.out.println(i);



        nums.forEach(i -> System.out.println(i));

    } 
}

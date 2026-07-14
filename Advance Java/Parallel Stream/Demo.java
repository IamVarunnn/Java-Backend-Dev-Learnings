
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// package Parallel Stream;

public class Demo {
    public static void main(String[] args) {
        

        int size = 10_000;

        List<Integer> nums = new ArrayList<>(size);


        Random ran = new Random();

        for(int i = 1; i <= size; i++){
            nums.add(ran.nextInt(100));
        }


        

    }
}

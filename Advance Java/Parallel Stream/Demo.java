
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


        int sum = nums.stream()
                    .map(i -> i * 2)
                    .reduce(0, (c , e) -> (c + e));

        // System.out.println(sum);


        long seqTime = System.currentTimeMillis();
        int sum1 = nums.stream()
                    .map(i -> {

                        try {
                            Thread.sleep(1);
                        } catch (Exception e) {
                        }

                        return i * 2;
                    })
                    .mapToInt(i -> i)
                    .sum();
        long endTime = System.currentTimeMillis();

        long paraTime = System.currentTimeMillis();
        int sum2 = nums.parallelStream()
                    .map(i -> {

                        try {
                            Thread.sleep(1);
                        } catch (Exception e) {
                        }

                        return i * 2;
                    })
                    .mapToInt(i -> i)
                    .sum();
        long endPara = System.currentTimeMillis();



        System.out.println(sum1 + " " + sum2);
        System.out.println("Seq " + (endTime - seqTime));
        System.out.println("Para " + (endPara - paraTime));


    }
}

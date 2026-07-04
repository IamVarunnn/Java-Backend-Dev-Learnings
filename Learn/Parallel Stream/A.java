// package Parallel Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class A {

    public static void main(String[] args) {
        

        // List<Integer> nums = Arrays.asList(1, 4, 6, 5, 7, 2);

        List<Integer> ls = new ArrayList<>(10000);

        Random ran = new Random();

        int size = 10_000;

        for(int i = 1; i <= size; i++){
            ls.add(ran.nextInt(100));
        }

        // int sum1 = ls.stream()
        //             .map(n -> (n * 2))
        //             .reduce(0, (c, e) -> c + e);
        

        long startSeq = System.currentTimeMillis();

        int sum2 = ls.stream()
                    .map(n -> {

                        try {
                            Thread.sleep(1);
                        } catch (Exception e) {
                        }
                        
                        return n * 2;
                    })
                    .mapToInt(n -> n)
                    .sum();

        long endSeq = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();

        int sum3 = ls.parallelStream()
                    .map(n -> {

                        try {
                            Thread.sleep(1);
                        } catch (Exception e) {
                        }
                        
                        return n * 2;
                    })
                    .mapToInt(n -> n)
                    .sum();

        long endPara = System.currentTimeMillis();
                
        System.out.println(sum2 + " " + sum3);
        System.out.println("Seq : " + (endSeq - startSeq));
        System.out.println("Seq : " + (endPara - startPara));
    }
    
}


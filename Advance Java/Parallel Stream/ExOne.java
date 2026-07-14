// package Parallel Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExOne {
    public static void main(String[] args) {
        
        int size = 10_000;

        List<Integer> ls = new ArrayList<>();

        Random ran = new Random();

        for(int i = 1; i <= size; i++){
            ls.add(ran.nextInt(100));
        }

        long seqTime = System.currentTimeMillis();

        long sum1 = ls.stream()      
                    .map(i -> i * i)
                    .mapToLong(i -> i)
                    .sum();

        long seqEnd = System.currentTimeMillis();

        long paraTime = System.currentTimeMillis();

        long sum2 = ls.parallelStream()      
                    .map(i -> i * i)
                    .mapToLong(i -> i)
                    .sum();

        long paraEnd = System.currentTimeMillis();


        System.out.println("Sum1 " + sum1 + " " + "Sum2 " + sum2);
        System.out.println("Seq " + (seqEnd - seqTime));
        System.out.println("Para " + (paraEnd - paraTime));
    }
}

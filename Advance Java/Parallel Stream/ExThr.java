// package Parallel Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ExThr{
    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            String str = random.ints(6, 'a', 'z' + 1)
                               .collect(StringBuilder::new,
                                        StringBuilder::appendCodePoint,
                                        StringBuilder::append)
                               .toString();

            names.add(str);
        }

        long seqStart = System.currentTimeMillis();

        long count1 = names.stream()
                        .map(i -> i.toUpperCase())
                        .count();

        long seqEnd = System.currentTimeMillis();

        long paraStart = System.currentTimeMillis();

        long count2 = names.parallelStream()
                        .map(i -> i.toUpperCase())
                        .count();

        long paraEnd = System.currentTimeMillis();


        System.out.println(count1);
        System.out.println(count2);

        System.out.println("Seq " + (seqEnd - seqStart));
        System.out.println("Para " + (paraEnd - paraStart));
    }
}
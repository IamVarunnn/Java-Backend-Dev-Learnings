// package Lam With Return;

interface Calculator{
    int add(int a, int b);
}

public class ExOne {
    
    public static void main(String[] args) {
        
        Calculator c = (a, b) -> (a + b);

        System.out.println(c.add(2,4));
    }
}

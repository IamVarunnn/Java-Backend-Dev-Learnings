// package Lam With Return;

interface Greeting{

    void greet(String name);
}

public class ExTwo {
   public static void main(String[] args) {
    
        Greeting greeting = (name) -> System.out.println("Hello " + name);

        greeting.greet("Arjun");
        
   } 
}

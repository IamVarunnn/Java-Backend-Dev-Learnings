// package Lambda Expression;

@FunctionalInterface
interface A{

    // void show(int i);
    void show(int i);
}

public class Main {
    public static void main(String[] args) {
        
        // A obj = () -> System.out.println("Printed ");
        A obj = i -> System.out.println("Printed " + i);

        obj.show(2);
    }
}

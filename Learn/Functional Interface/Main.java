
@FunctionalInterface
interface A{
    
    // void show(int i);

    int add(int a, int b);
    
}

 
public class Main {

    public static void main(String[] args) {
        
        // A obj = () -> {
        //         System.out.println("Done");
        //     };

        // A obj = new A(){
        //     public void show(int i){
        //         System.out.println("Show" + i);
        //     }
        // };

        // A obj = i -> System.out.println("SHow" + i);

        // obj.show(5);


        // A obj = new A(){
        //     public int add(int a, int b){
        //         return a + b;
        //     }
        // };

        // System.out.println(obj.add(2, 5));

        // A obj = (a, b) ->{return a + b;};
        // System.out.println(obj.add(2, 6));

        A obj = (a, b) -> a + b;
    }
}
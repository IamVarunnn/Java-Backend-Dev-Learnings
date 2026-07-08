// package Functional Interface New;

@FunctionalInterface
interface A{
    void show();
}

// class B implements A{
//     public void show(){
//         System.out.println("Showing");
//     }
// }

public class Main {
    public static void main(String[] args) {
        
        // A obj = new B();
        // obj.show();


        // A obj = new A() {
        //     public void show(){
        //         System.out.println("In Showing");
        //     }
        // };

        // obj.show();

        A obj = () -> System.out.println("In Showing");

        obj.show();




    }
}

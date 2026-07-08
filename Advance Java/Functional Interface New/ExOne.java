// package Functional Interface New;

@FunctionalInterface
interface A{
    public void print();
}


// class B implements A{
//     public void print(){
//         System.out.println("Printed");
//     }
// }

public class ExOne {
    public static void main(String[] args) {
        
        // Normal Way
        // A obj = new B();
        // obj.print();

        // Using Anonymous Way
        // A obj = new A() {
        //     public void print(){
        //         System.out.println("Printed");
        //     }
        // };

        // obj.print();

        // Using Lambda 

        A obj = () -> System.out.println("Printed");

        obj.print();
    }

}

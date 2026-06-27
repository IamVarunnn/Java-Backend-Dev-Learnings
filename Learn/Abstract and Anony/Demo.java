 
abstract class A{
    abstract void show();
}

// class B extends A{
//     void show(){
//         System.out.println("I am B show");
//     }
// }

public class Demo {
    public static void main(String[] args) {
        
        A obj = new A(){
            void show(){
                System.out.println("I am any");
            }
        };
        obj.show();
    }
}



abstract class A{

    public abstract void show();
}

class B extends A{

    public void show(){
        System.out.println("Showing");
    }
}

public class Main {
    public static void main(String[] args) {
        
        // A obj = new B();
        // obj.show();

        A obj = new A(){
            
            public void show(){
                System.out.println("Showing An");
            }
        };

        obj.show();
    }
}

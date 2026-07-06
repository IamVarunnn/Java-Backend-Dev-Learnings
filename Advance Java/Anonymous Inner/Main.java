// package Anonymous Inner;


class A{
    public void show(){
        System.out.println("Hello");
    }
}

public class Main {
    public static void main(String[] args) {
        
        // A obj = new A();
        // obj.show();

        A obj = new A(){
            public void show(){
                System.out.println("Not Hello");
            }

            
        };

        obj.show();
    }
}

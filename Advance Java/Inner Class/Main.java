// package Inner Class;

class A{

    int age;
    
    public void show(){
        System.out.println("In Show");
    }

    class innerA{
        
        public void config(){
            System.out.println("in config");
        }
    }
}

class B{

    int age;
    
    public void show(){
        System.out.println("In Show");
    }

    static class innerB{
        
        public void config(){
            System.out.println("in config");
        }
    }
}

public class Main {
    public static void main(String[] args) {
    
        // A a = new A();
        // a.show();

        // A.innerA inA = a.new innerA();


        B a = new B();

        B.innerB b = new B.innerB();
    }
}

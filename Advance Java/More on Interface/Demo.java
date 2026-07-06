// package More on Interface;


interface A{

    int age = 44;

    void show();
    void config();
}

interface X{
    void run();
}

 

class B implements A, X{

    public void show(){
        System.out.println("In Show");
    }

    public void config(){
        System.out.println("In Config");
    }

    public void run(){
        System.out.println("Running");
    }
}

public class Demo {
   public static void main(String[] args) {
    
        // A obj = new B();

        // obj.config();
        // obj.show();

        // B objj = new B();

        // objj.run();

        A obj = new B();
        obj.config();
        obj.show();

        X objj = new B();
        objj.run();
   } 
}

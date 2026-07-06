// package More on Interface;


// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface A{
 
    void show();
    void config();
}

interface X{
    void run();
}

class B implements A,Y{

    public void show(){
        System.out.println("In Show");
    }

    public void config(){
        System.out.println("In COnfig");
    }

    public void run(){
        System.out.println("Running");
    }
}

interface Y extends X{
    
}

public class Main {
    public static void main(String[] args) {
        
        A obj1 = new B();

        X obj = new B();

        obj.run();
    }
}

// package Interface;

// abstract class A{

//     public abstract void show();
//     public abstract void config();
// }

interface A{

    public void show();
    public void config();
}

class B implements A{

    public void show(){
        System.out.println("Showing");
    }

    public void config(){
        System.out.println("Config");
    }
}

public class Demo {
    public static void main(String[] args) {
        
        A obj = new B();

        obj.show();
        obj.config();
    }
}

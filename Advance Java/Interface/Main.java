// package Interface;

 
interface A{
    // final and static
    final int age = 0;
    final String area = "Hyd";

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

public class Main {
    public static void main(String[] args) {
        
        A obj = new B();

        obj.config();
      
        System.out.println(A.age);
    }
}

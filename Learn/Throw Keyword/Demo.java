 
class A{

    void show() throws ClassNotFoundException{
         
        Class.forName("Demmo");

         
    }
}

public class Demo {
    static{
        System.out.println("class loaded");
    }
    public static void main(String[] args) {
        
        
        A obj = new A();

        try {
             obj.show();
        } catch (Exception e) {
            System.out.println("Found you");
        }
        
    }
}

// package Dock using throws;

class A{

    public void show() throws ClassNotFoundException{

         
        Class.forName("Emo");
         
    }
}

 
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        

        
        A obj = new A();
        
        obj.show();
    } 
}

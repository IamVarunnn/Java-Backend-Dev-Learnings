
interface A{
    final  int age = 19;
    String area = "MUMBaI";
    void show();
    void config();
}

interface X{
    final  int age = 19;
    String area = "MUMBaI";
    void show();
    void config();
    void run();
}

class B implements A, X{
    public  void show(){
        System.out.println("Showing");
    }

    public void config(){
        System.out.println("Config");
    }

    public void run(){
        System.out.println("Runnig");
    }
}

public class Demo {
    public static void main(String[] args) {
        
        A obj;
        obj = new B();
        obj.show();
        System.out.println(A.age);

        X obj1 = new B();
        obj1.run();
    }
}

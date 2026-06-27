

 
class A{

    public void show(){
        System.out.println("I am A class");
    }
}

class B extends A{
    public void show(){
        System.out.println("I am B class");
    }
}

public class Demo {
    public static void main(String[] args) {
        A a = new B(){
            public void show(){
                System.out.println("I am anynoumus");;
            }
        };
        a.show();
    }
}

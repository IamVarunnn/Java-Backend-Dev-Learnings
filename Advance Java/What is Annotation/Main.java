// package What is Annotation;

@Deprecated
class A{
    public void show(){
        System.out.println("In A Show");
    }

    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In A Show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B Show");
    }
    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In B Show");
    }
}

public class Main {
    public static void main(String[] args) {
        
        B obj = new B();
        // obj.show();
        obj.showTheDataWhichBelongsToThisClass();
    }
}

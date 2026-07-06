
abstract class Shape{
    abstract double area();
}

class Circle extends Shape{
    int r;

    public Circle(int r) {
        this.r = r;
    }

    

    public double area(){
        return 3.17 * r * r;
    }
}

class Rectangle extends Shape{

    int l;
    int b;

    public Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }

    public double area(){
        return l * b;
    }
}

public class Calci {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        System.out.println(s1.area());
    }
}

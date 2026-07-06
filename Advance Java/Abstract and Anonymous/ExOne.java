// package Abstract and Anonymous;

abstract class Shape{
    
    abstract double area();
}

public class ExOne {
    
    public static void main(String[] args) {
        
        Shape circle = new Shape(){
            int s = 10;
            public double area(){
                return s * s;
            }
        };

        System.out.println(circle.area());
    }
}

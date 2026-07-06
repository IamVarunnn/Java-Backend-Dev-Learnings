// package Interface;

interface Singer{
    public void sing();
}


interface Dancer{
    public void dance();
}

class Student implements Singer, Dancer{
    public void sing(){
        System.out.println("Singing");
    }

    public void dance(){
        System.out.println("Dancing");
    }
}

public class ExFour {
    public static void main(String[] args) {
        
    }
}

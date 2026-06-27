 

abstract class Computer{

    public abstract void code();
}

class Laptop extends Computer{

    public void code(){
        System.out.println("Code, Compile and Code");
    }
}

class Desktop extends Computer {
    public void code(){
        System.out.println("Code, Compile and Code : Faster");
    }
}

class Developer{
    
    public void devApp(Computer lap){
        // System.out.println("Coding");
        lap.code();
    }
}

public class Demoo {
    public static void main(String[] args) {
        
        Developer ravi = new Developer();
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        ravi.devApp(desk);
        ravi.devApp(lap);
    }
}

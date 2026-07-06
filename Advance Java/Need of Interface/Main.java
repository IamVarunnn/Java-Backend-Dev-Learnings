// package Need of Interface;

// abstract class Computer{

//     public abstract void code();
// }




// class Laptop extends Computer{

//     public void code(){
//         System.out.println("code, compile and run");
//     }
// }

// class Desktop extends Computer{

//     public void code(){
//         System.out.println("code, compile and run : Faster");
//     }
// }

interface Computer{

    public void code();
}

class Laptop implements Computer{

    public void code(){
        System.out.println("code, compile and run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile and run : Faster");
    }
}

class Developer{

    public void devApp(Computer lap){
         
        lap.code();
    }
}

public class Main {
    public static void main(String[] args) {
        

        // Laptop lap = new Laptop();
        // Desktop desk = new Desktop();

        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer navin = new Developer();

        // navin.devApp(lap);
        navin.devApp(desk);
    }    
}

// package Interface;

interface Payable{
    public void pay();
}

interface Deliverable{
    public void deliver();
}

class Order implements Payable, Deliverable{

    public void pay(){
        System.out.println("Paying");
    }

    public void deliver(){
        System.out.println("Delivered");
    }
}

public class ExFive {
    
}

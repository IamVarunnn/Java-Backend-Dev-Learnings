
interface Payment{
    public void pay();
}

class UPI implements Payment{

    public void pay(){
        System.out.println("Paid Using UPI");
    }
}

class Credit implements Payment{

    public void pay(){
        System.out.println("Paid Using Credit Card");
    }
}

class OrderService{

    public void payment(Payment mode){
        mode.pay();
    }
}
public class ExTwo {
    public static void main(String[] args) {
        

        Payment UPI = new UPI();
        Payment Credit = new Credit();

        OrderService order = new OrderService();
        order.payment(UPI);
    }
}

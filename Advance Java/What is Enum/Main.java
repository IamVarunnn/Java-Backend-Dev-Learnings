// package What is Enum;

enum Status{
    PLACED,
    SHIPPED,
    DELIVERED;
}



// enum Status{
//     Running, Working, Failed, Pending, Success;
// }

public class Main {
    public static void main(String[] args) {
        
        Status s = Status.PLACED;

        // System.out.println(s);

        switch (s) {
            case SHIPPED:
                System.out.println("Shipped");
                break;
            case PLACED:
                System.out.println("Placed");
                break;
            case DELIVERED:
                System.out.println("Delivered");
            default:
                throw new AssertionError();
        }
    }
}

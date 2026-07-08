// package Enum Switch;

enum Status{
    Running, Failed, Pending, Success;
}


public class Main {
    public static void main(String[] args) {

        Status s = Status.Pending;

        switch (s) {
            case Pending:
                System.out.println("Pending");
                break;
            case Running:
                System.out.println("Running");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            case Success:
                System.out.println("Success");
                break;
            default:
                throw new AssertionError();
        }
    }
}

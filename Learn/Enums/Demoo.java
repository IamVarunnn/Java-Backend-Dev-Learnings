enum Status{
    Running, Failed, Pending, Success;
}

class Demoo{
    public static void main(String[] args) {
        
        Status s = Status.Pending;

        // if(s == Status.Running){
        //     System.out.println("All Good");
        // }
        // else if(s == Status.Failed){
        //     System.out.println("Try Again");
        // }
        // else if(s == Status.Pending){
        //     System.out.println("Please wait");
        // }
        // else if(s == Status.Success) {
        //     System.out.println("Done");
        // }

        switch (s) {
            case Pending:
                System.out.println("Please Wait");
                break;
            
            case Running:
                System.out.println("All Good");
                break;
            case Success:
                System.out.println("All Done");
                break;
            case Failed:
                System.out.println("Failed");
            default:
                throw new AssertionError();
        }
    }
}
 
enum Status{
    Running, Failed, Pending, Success;
}

public class Demo {
    public static void main(String[] args) {
        
        Status s = Status.Running;
        Status s2 = Status.Success;
        Status s3 = Status.Failed;

        Status arr[] = Status.values();

        System.out.println(s.ordinal());
        System.out.println(s2.ordinal());
        System.out.println(s3.ordinal());
        
        for(Status it : arr){
            System.out.println(it);
        }
    }
}

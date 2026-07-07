// package What is Enum;

enum Status{
    LOW,
    MEDIUM,
    HIGH;
}

class Ticket{

    int id;
    String title;
    Status status;

    public Ticket(int id, String title, Status status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    public void display(){

        System.out.println("Id : " + this.id);
        System.out.println("title : " + this.title);
        System.out.println("Status : " + this.status);
    }

    
}

public class ExTwo {
    public static void main(String[] args) {
        

        Ticket ticket1 = new Ticket(1, "Work", Status.MEDIUM);
        Ticket ticket2 = new Ticket(13, "Song", Status.LOW);
        Ticket ticket3 = new Ticket(3, "Code", Status.HIGH);

        ticket1.display();
    }
}

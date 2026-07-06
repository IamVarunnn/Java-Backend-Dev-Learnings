
 

// package Interface;


interface Notification{
    public void sendMessage();
}

class Email implements Notification{
    public void sendMessage(){
        System.out.println("Message sent");
    }
}
public class ExTwo {
    public static void main(String[] args) {
        
    }
}

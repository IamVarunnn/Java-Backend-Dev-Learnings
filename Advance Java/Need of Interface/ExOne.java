
interface NotificationService{
    public void notification();
}

class Email implements NotificationService{
    public void notification(){
        System.out.println("Email");
    }
}

class SMS implements NotificationService{
    public void notification(){
        System.out.println("SMS");
    }
}

class Facebook{

    public void addNotification(NotificationService ns){
        ns.notification();
    }
}


public class ExOne {
    public static void main(String[] args) {
        
        NotificationService email = new Email();
        NotificationService sms = new SMS();


        Facebook fb = new Facebook();

        fb.addNotification(sms);
    }
}

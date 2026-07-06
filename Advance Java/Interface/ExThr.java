// package Interface;


interface Camera{
    public void takePhoto();
}

interface Wifi{
    public void connectWifi();
}

class Phone implements Camera, Wifi{

    public void takePhoto(){
        System.out.println("Captured");
    }

    public void connectWifi(){
        System.out.println("Wifi Connected");
    }
}

public class ExThr {
    
}

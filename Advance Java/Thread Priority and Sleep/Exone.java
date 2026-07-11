// package Thread Priority and Sleep;

class CricketThread extends Thread{

    public void run(){

        for(int i = 1; i <= 5; i++){

            System.out.println("Cricket");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class FootballThread extends Thread{

    public void run(){

        for(int i = 1; i <= 5; i++){

            System.out.println("Football");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}


public class Exone {
    public static void main(String[] args) {
        
        
        CricketThread cricket = new CricketThread();
        FootballThread football = new FootballThread();

        cricket.start();
        football.start();
    }
}


class ScoreBoard{

    int score = 0;

    public synchronized void addPoint(){
        score++;
    }
}


class Player1 implements Runnable{

    ScoreBoard sc;

    public Player1(ScoreBoard sc) {
        this.sc = sc;
    }

    public void run(){
        for(int i = 0; i < 5000; i++){
            sc.addPoint();
        }
    }
}

class Player2 implements Runnable{

    ScoreBoard sc;

    public Player2(ScoreBoard sc) {
        this.sc = sc;
    }

    public void run(){
        for(int i = 0; i < 5000; i++){
            sc.addPoint();
        }
    }
}

class Player3 implements Runnable{

    ScoreBoard sc;

    public Player3(ScoreBoard sc) {
        this.sc = sc;
    }

    

    public void run(){
        for(int i = 0; i < 5000; i++){
            sc.addPoint();
        }
    }
}

public class ExTwo {
    public static void main(String[] args) {
        
        
        ScoreBoard sc = new ScoreBoard();


        Player1 player1 = new Player1(sc);
        Player2 player2 = new Player2(sc);
        Player3 player3 = new Player3(sc);


        Thread t1 = new Thread(player1);
        Thread t2 = new Thread(player2);
        Thread t3 = new Thread(player3);


        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
        }

        System.out.println(sc.score);


    }
}

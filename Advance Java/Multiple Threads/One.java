// package Multiple Threads;

class NumbersThread extends Thread{

    public void run(){

        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
    }
}


class LettersThread extends Thread{

    public void run(){
        System.out.println();
        for(int i = 0; i < 5; i++){
            System.out.println((char)('A' + i));
        }
    }
}

public class One {
    public static void main(String[] args) {
        
        
        NumbersThread nt = new NumbersThread();
        LettersThread lt = new LettersThread();

        nt.start();
        lt.start();
    }
}

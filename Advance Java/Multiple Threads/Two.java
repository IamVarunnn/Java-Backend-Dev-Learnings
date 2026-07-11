// package Multiple Threads;


class Even extends Thread{

    public void run(){

        for(int i = 1; i <= 10; i++){
            
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

class Odd extends Thread{

    public void run(){

        System.out.println();
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}


public class Two {
    public static void main(String[] args) {
        

        Even even = new Even();
        Odd odd = new Odd();

        even.start();
        
        odd.start();
    }
}

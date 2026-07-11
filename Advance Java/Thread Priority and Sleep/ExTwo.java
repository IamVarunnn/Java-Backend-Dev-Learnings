// package Thread Priority and Sleep;


class FastThread extends Thread{

    public void run(){

        for(int i = 0; i < 10; i++){

            System.out.println("Fast");
        }
    }
}

class SlowThread extends Thread{

    public void run(){

        for(int i = 0; i < 10; i++){

            System.out.println("Slow");
        }
    }
}

public class ExTwo {
    public static void main(String[] args) {
        

        FastThread fast = new FastThread();
        SlowThread slow = new SlowThread();

        fast.setPriority(Thread.MAX_PRIORITY);
        slow.setPriority(Thread.MIN_PRIORITY);

        slow.start();
        fast.start();
    }
}

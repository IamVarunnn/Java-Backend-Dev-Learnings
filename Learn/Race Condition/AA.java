 

class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}

public class AA {
    public static void main(String[] args) {
        
        Counter c = new Counter();

        Runnable a = () ->{
           
            for(int i = 1; i <= 1; i++){
                c.increment();

            }
            
        };
        Runnable b = () ->{
            for(int i = 1; i <= 1; i++){
                c.increment();
            }
        };

        

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

        try {
            t1.join();
        t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(c.count);
    }
}

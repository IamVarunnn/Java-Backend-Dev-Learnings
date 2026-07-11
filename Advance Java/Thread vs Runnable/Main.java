// package Thread vs Runnable;

// class A implements Runnable{

//     public void run(){

//         for(int i = 1; i <= 10; i++){

//             System.out.println("Hi");

//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

class B implements Runnable{

    public void run(){

        for(int i = 1; i <= 10; i++){

            System.out.println("Hello");

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        

        Runnable a = () ->{

            
            for(int i = 1; i <= 10; i++){

                System.out.println("Hi");

                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            
        };


        Runnable b = () ->{

            
            for(int i = 1; i <= 10; i++){

                System.out.println("Hello");

                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}

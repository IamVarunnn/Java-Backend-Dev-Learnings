// package Threads;


// class A implements Runnable{

//     public void run(){
//         // System.out.println("Hi");

//         for(int i = 0; i < 10; i++){
//             System.out.println("Hi " + i);
//             // System.out.println();
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable{

//     public void run(){
       
//         for(int i = 0; i < 10; i++){
//             System.out.println("Hello " + i);
//             // System.out.println();
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }


public class BB {
    public static void main(String[] args) {
        
        // Runnable a = new Runnable(){
        //     public void run(){

        //         for(int i = 0; i < 5; i++){
        //             System.out.println("HI");
        //         }
        //     }
        // };

        Runnable a = () ->{
           

            for(int i = 0; i < 5; i++){
                System.out.println("HI");
            }
            
        };
        Runnable b = () ->{
            for(int i = 0; i < 5; i++){
                System.out.println("Hello");
            }
        };

        // a.show();
        // b.show();

        // System.out.println(a.getPriority());

        // b.setPriority(Thread.MAX_PRIORITY);

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}

// package Thread vs Runnable;


class Person{

}

class Teacher extends Person implements Runnable{

    public void run(){
        System.out.println("Teaching");
    }
}

public class Exone {
   public static void main(String[] args) {

        Teacher teacher = new Teacher();

        Thread t1 = new Thread(teacher);

        t1.start();
   } 
}

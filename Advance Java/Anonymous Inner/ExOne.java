// package Anonymous Inner;

class Animal {
    public void sound() {
        System.out.println("Animal Sound");
    }
}

public class ExOne {
    public static void main(String[] args) {
        Animal ani = new Animal(){
            public void sound(){
                System.out.println("I am dog ");
            }
        };

        ani.sound();
    }
}

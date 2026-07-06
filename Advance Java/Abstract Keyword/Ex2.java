
abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{

    public void sound(){
        System.out.println("Bark");
    }
}

class Cat extends Animal{

    public void sound(){
        System.out.println("Meow");
    }
}

class Cow extends Animal{

    public void sound(){
        System.out.println("Moo");
    }
}

public class Ex2 {
    public static void main(String[] args) {
        
        Animal a = new Cat();
        a.sound();
    }
}

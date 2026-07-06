class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog Barking");
    }
}

class Cat extends Animal{
    void sound() {
        System.out.println("Cat Barking");
    }
}

public class Fake {

    public static void main(String[] args) {

        Animal a = new Dog(); // Parent reference, Child object

        Animal b = new Cat();

        a.sound();
    }
}
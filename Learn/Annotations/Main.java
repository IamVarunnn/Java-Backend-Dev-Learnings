 


class A{

    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("IN A SHOW");
    }
}


class B extends A{

    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("IN B SHOW");
    }
}


class Main{

    public static void main(String[] args) {
        
        B b = new B();
        b.showTheDataWhichBelongsToThisClass();
    }
}
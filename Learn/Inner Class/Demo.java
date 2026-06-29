class A{

    int age = 10;

    public void show(){
        System.out.println("I am class A" + age);
    }

    static  class B{
        public void config(){
            
            System.out.println("I am inner");
        }
    }
}

class Demo{
    public static void main(String[] args) {
        
        A obj = new A();

        obj.show();

        // A.B s = obj.new B();
        A.B s = new A.B();
        s.config();

    }
}
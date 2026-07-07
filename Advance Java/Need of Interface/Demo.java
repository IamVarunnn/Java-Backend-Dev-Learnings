

interface Computer{
    public void code();
}

class Laptop implements Computer{

    public void code(){
        System.out.println("Code run and execute");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Code Quicker");
    }
}


class Developer{

    public void code(Computer comp){
        comp.code();
    }
}

class Demo{
    public static void main(String[] args) {
        
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer nav = new Developer();


        // nav.devApp(lap);
        nav.code(desk);
    }
}
// package Lam With Return;


interface A{
    int add(int i, int j);
}

public class Main {
    public static void main(String[] args) {
        
        // Anonmyous Way
        // A obj = new A(){

        //     public int add(int i, int j){
        //         return i + j;
        //     }
        // };

        // int res = obj.add(5,5);
        // System.out.println(res);

        // Lamda - 1

        // A obj = (int i, int j) -> { return (i + j); };

        // Lambda 2

        A obj = (i, j) -> i + j;

        System.out.println(obj.add(3, 4));

    }
}

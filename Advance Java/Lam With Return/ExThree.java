// package Lam With Return;


interface Eligibility {
    boolean canVote(int age);
}

public class ExThree {
   public static void main(String[] args) {

        Eligibility elg = (age) -> age >= 18; 

        System.out.println(elg.canVote(20));
   } 
}

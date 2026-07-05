
import java.util.ArrayList;
import java.util.List;

class BankService{

    List<Account> ls;

    public BankService() {
        ls = new ArrayList<>();
    }

    public void createAccount(Account acc){

        for(Account ac : ls){

            if(ac.getAccountNumber() == acc.getAccountNumber()){
                System.out.println("Account already exits");
                return;
            }
        }

        ls.add(acc);
        System.out.println("Account Created successfully");
    }

    public void viewAccounts(){

        if(ls.isEmpty()){
            System.out.println("No accounts exits");
            return;
        }

        for(Account ac : ls){
            System.out.println(ac);
        }
    }

    public void searchAccount(int accountNumber){

        if(ls.isEmpty()){
            System.out.println("No accounts exits");
            return;
        }

        for(Account ac : ls){

            if(ac.getAccountNumber() == accountNumber){
                System.out.println(ac.toString());
                return;
            }
        }

        System.out.println("Account does not exists");
    }

    public void deposit(int accountNumber, double amount){

        if(ls.isEmpty()){
            System.out.println("No account exists");
            return;
        }
        
        for(Account ac : ls){

            if(ac.getAccountNumber() == accountNumber){
                ac.setBalance(ac.getBalance() + amount);
                return;
            }
        }

        System.out.println("Account does not exist");
        
    }

    public void withdraw(int accountNumber, double amount){

        if(ls.isEmpty()){
            System.out.println("No account exists");
            return;
        }

        for(Account ac : ls){

            if(ac.getAccountNumber() == accountNumber){

                if(ac.getBalance() >= amount){
                    ac.setBalance(ac.getBalance() - amount);
                   
                }
                else{
                    System.out.println("Insufficient Balance");
                }
            }
             
        }

        System.out.println("Account does not exist");

    }

    public void checkBalance(int accountNumber){

        if(ls.isEmpty()){
            System.out.println("No account exists");
            return;
        }

        
        for(Account ac : ls){

            if(ac.getAccountNumber() == accountNumber){

                System.out.println("Balance" + ac.getBalance());
                return;
            }
             
        }

        System.out.println("Cannot show Balance");
    }

    public void deleteAccount(int accountNumber){

        if(ls.isEmpty()){
            System.out.println("No account exists to delete");
            return;
        }

        for(int i = 0; i < ls.size(); i++){

            if(ls.get(i).getAccountNumber() == accountNumber){
                ls.remove(i);
                 System.out.println("Account Deleted Successfully");
                return;
            }
        }

        System.out.println("Account does not exist");
    }

    
}
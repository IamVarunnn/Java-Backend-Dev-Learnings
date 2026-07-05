import java.util.ArrayList;
import java.util.List;

class Library{

    List<Book> ls;

    public Library() {
        ls = new ArrayList<>();
    }

    public void addBook(Book book){

        for(Book bs : ls){

            if(bs.getId() == book.getId()){
                System.out.println("Book is already available");
                return;
            }
        }
        ls.add(book);
        System.out.println("Book added successfully");
        
    }

    public void viewBooks(){

        if(ls.isEmpty()){
            System.out.println("No Books Available");
            return;
        }
                
        for(Book bk : ls){
            System.out.println(bk);
             
        }
    }

    public void searchBook(int id){
        
        if(ls.isEmpty()){
            System.out.println("Books are not available");
            return;
        }

        for(Book bk : ls){

            if(bk.getId() == id){
                System.out.println("Book is available");
                return;
                 
            }
             
        }
          System.out.println("Book is not available");

    }

    public void issueBook(int id){

        if(ls.isEmpty()){
            System.out.println("Books are not available");
            return;
        }

        for(Book bk : ls){

            if(bk.getId() == id){
                
                if(!bk.isIsAvailable()){
                    System.out.println("Book already issued");
                    return;
                }

                System.out.println("Here is the book" + bk.getTitle());
                bk.setIsAvailable(false);
                return;
            }
        }

        System.out.println("Book is not available");
    }

    public void returnBook(int id){

        

        for(Book bs : ls){

            if(bs.getId() == id){

                if(bs.isIsAvailable()){
                    System.out.println("Book was not issued");
                    return;
                }

                bs.setIsAvailable(true);
                System.out.println("Book Returned Successfully");
                return;
            }
        }

        System.out.println("Book not found");

    }

    public void deleteBook(int id){

        if(ls.isEmpty()){
            System.out.println("Invalid Book");
            return;
        }
        
        for(int i = 0; i < ls.size(); i++){

            if(ls.get(i).getId() == id){
                ls.remove(i);
                System.out.println("Deleted Successfully");
                return;
            }
        }

        System.out.println("Book not found");
    }

    public void exit(){
        System.out.println("Thank you for visiting");
    }

    
}
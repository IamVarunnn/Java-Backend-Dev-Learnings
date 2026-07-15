
import java.util.Arrays;
import java.util.List;

// package Constructor Reference;

class Book{

    String title;

    Book(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + "]";
    }

    
}

public class ExTwo {
    public static void main(String[] args) {
        
        List<String> titles = Arrays.asList( "Java", "Spring", "DSA" );


        List<Book> books = titles.stream()
                        .map(Book :: new)
                        .toList();

        System.out.println(books);
    }
}

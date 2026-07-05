class Main{
    public static void main(String[] args) {
        

        Book book = new Book(1, "A", true, "Reach");

        Library lib = new Library();

        lib.addBook(book);

        lib.viewBooks();

        
    }
}
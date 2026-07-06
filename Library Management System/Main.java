class Main {

    public static void main(String[] args) {

        Library lib = new Library();

        // Add Books
        Book b1 = new Book(1, "Java", true, "James");
        Book b2 = new Book(2, "Spring Boot", true, "John");
        Book b3 = new Book(3, "DSA", true, "Striver");
        Book b4 = new Book(1, "Duplicate Book", true, "Someone");

        System.out.println("===== ADD BOOKS =====");
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);
        lib.addBook(b4); // Duplicate ID

        System.out.println("\n===== VIEW BOOKS =====");
        lib.viewBooks();

        System.out.println("\n===== SEARCH BOOK =====");
        lib.searchBook(2);    // Exists
        lib.searchBook(100);  // Doesn't exist

        System.out.println("\n===== ISSUE BOOK =====");
        lib.issueBook(2);     // Issue successfully
        lib.issueBook(2);     // Already issued

        System.out.println("\n===== RETURN BOOK =====");
        lib.returnBook(2);    // Return successfully
        lib.returnBook(2);    // Already returned

        System.out.println("\n===== DELETE BOOK =====");
        lib.deleteBook(3);    // Delete existing
        lib.deleteBook(100);  // Doesn't exist

        System.out.println("\n===== FINAL BOOK LIST =====");
        lib.viewBooks();

        System.out.println("\n===== EXIT =====");
        lib.exit();
    }
}
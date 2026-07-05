public class Book {
    
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int id, String author, boolean isAvailable, String title) {
        this.author = author;
        this.id = id;
        this.isAvailable = isAvailable;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", isAvailable=" + isAvailable + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}

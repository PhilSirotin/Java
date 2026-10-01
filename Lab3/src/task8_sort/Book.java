package task8_sort;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title  = title;
        this.author = author;
    }

    public String getTitle()  { return title; }
    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return String.format("Book{title='%s', author='%s'}", title, author);
    }
}

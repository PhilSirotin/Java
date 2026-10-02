public abstract class Document {
    protected String title;
    protected String author;

    public Document(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void print();
}
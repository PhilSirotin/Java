public class Report extends Document {
    private int numberOfPages;

    public Report(String title, String author, int numberOfPages) {
        super(title, author);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void print() {
        System.out.println("Отчёт: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Количество страниц: " + numberOfPages);
    }
}
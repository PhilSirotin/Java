package task8_sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortMethodRef {

    public static int compareByTitle(Book a, Book b) {
        return a.getTitle().compareToIgnoreCase(b.getTitle());
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(List.of(
            new Book("Преступление и наказание", "Достоевский"),
            new Book("Война и мир",               "Толстой"),
            new Book("Анна Каренина",              "Толстой"),
            new Book("Мастер и Маргарита",         "Булгаков"),
            new Book("Идиот",                      "Достоевский"),
            new Book("Горе от ума",                "Грибоедов"),
            new Book("Евгений Онегин",             "Пушкин")
        ));

        System.out.println("До сортировки:");
        books.forEach(System.out::println);

        // Ссылка на метод — SortMethodRef::compareByTitle
        books.sort(SortMethodRef::compareByTitle);

        System.out.println("\nПосле сортировки по названию (ссылка на метод):");
        books.forEach(System.out::println);

        // Ссылка на метод через Comparator.comparing — сортировка по автору
        books.sort(Comparator.comparing(Book::getAuthor));

        System.out.println("\nПосле сортировки по автору (Book::getAuthor):");
        books.forEach(System.out::println);
    }
}

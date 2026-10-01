package task5_string_length;


import java.util.function.Function;
import java.util.List;

public class StringLength {
    public static void main(String[] args) {
        Function<Document, Integer> contentLength = doc -> doc.getContent().length();

        List<Document> docs = List.of(
            new Document("Заметка",    "Короткий текст"),
            new Document("Статья",     "Это более длинный текст статьи с подробным описанием"),
            new Document("Отчёт",      "Ежеквартальный финансовый отчёт компании за 2024 год"),
            new Document("Пустой",     ""),
            new Document("Инструкция", "Шаг 1. Шаг 2. Шаг 3. Готово!")
        );

        System.out.println("=== Длина содержимого документов (Function<Document, Integer>) ===");
        docs.forEach(d ->
            System.out.printf("«%s» → длина контента: %d символов%n",
                d.getTitle(), contentLength.apply(d))
        );
    }
}

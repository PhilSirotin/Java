package task10_students;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StudentManager {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
            new Student("Алексей Иванов",   "ИС-21", 1, Map.of("Матан", 4, "Физика", 5, "Программирование", 5)),
            new Student("Мария Петрова",    "ИС-21", 1, Map.of("Матан", 2, "Физика", 2, "Программирование", 2)),
            new Student("Дмитрий Сидоров",  "ИС-22", 2, Map.of("Базы данных", 3, "Сети", 4, "Алгоритмы", 3)),
            new Student("Екатерина Новак",  "ИС-22", 2, Map.of("Базы данных", 5, "Сети", 5, "Алгоритмы", 4)),
            new Student("Иван Козлов",      "ИС-23", 3, Map.of("ОС", 1, "Архитектура", 2, "Компиляторы", 2)),
            new Student("Анна Смирнова",    "ИС-23", 3, Map.of("ОС", 4, "Архитектура", 5, "Компиляторы", 4)),
            new Student("Олег Фёдоров",     "ИС-24", 4, Map.of("Диплом", 3, "Стажировка", 3)),
            new Student("Юлия Белова",      "ИС-24", 4, Map.of("Диплом", 2, "Стажировка", 2))
        ));

        System.out.println("=== Исходный список студентов ===");
        students.forEach(System.out::println);

        Predicate<Student> isFailing = s -> s.getAverageGrade() < 3;

        // Лямбда 1: удаляем студентов со средним баллом < 3
        System.out.println("\n=== Отчисление студентов (Predicate<Student>) ===");
        students.removeIf(s -> {
            if (isFailing.test(s)) {
                System.out.printf("  Отчислен: %s (avg=%.2f)%n", s.getName(), s.getAverageGrade());
                return true;
            }
            return false;
        });

        Consumer<Student> promote = s -> {
            int old = s.getCourse();
            s.promoteToCourse(old + 1);
            System.out.printf("  %s: курс %d → %d%n", s.getName(), old, s.getCourse());
        };

        // Лямбда 2: переводим оставшихся на следующий курс
        System.out.println("\n=== Перевод на следующий курс (Consumer<Student>) ===");
        students.forEach(promote);

        System.out.println("\n=== Список после отчисления и перевода ===");
        students.forEach(System.out::println);

        // BiConsumer<List<Student>, Integer> — печатает имена студентов указанного курса
        BiConsumer<List<Student>, Integer> printByCourse = (list, course) -> {
            System.out.printf("%n=== Студенты %d-го курса (BiConsumer<List<Student>, Integer>) ===%n", course);
            list.stream()
                .filter(s -> s.getCourse() == course)
                .map(Student::getName)
                .forEach(name -> System.out.println("  " + name));
        };

        printByCourse.accept(students, 2);
        printByCourse.accept(students, 3);
        printByCourse.accept(students, 4);
        printByCourse.accept(students, 5);
    }
}

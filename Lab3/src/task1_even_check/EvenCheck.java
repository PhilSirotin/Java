package task1_even_check;

import java.util.function.Predicate;
import java.util.List;

public class EvenCheck {
    public static void main(String[] args) {
        Predicate<Person> hasEvenAge = person -> person.getAge() % 2 == 0;

        List<Person> people = List.of(
            new Person("Алексей",  25),
            new Person("Мария",    30),
            new Person("Дмитрий",  17),
            new Person("Екатерина", 22),
            new Person("Иван",     99)
        );

        System.out.println("=== Проверка чётности возраста (Predicate<Person>) ===");
        for (Person p : people) {
            System.out.printf("%s — возраст %d — %s%n",
                p.getName(), p.getAge(),
                hasEvenAge.test(p) ? "чётный" : "нечётный");
        }
    }
}

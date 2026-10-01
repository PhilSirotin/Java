package task2_greeting;

import task1_even_check.Person;

import java.util.function.Consumer;
import java.util.List;

public class Greeting {
    public static void main(String[] args) {
        Consumer<User> greet = user ->
        {
            System.out.println("Hello, " + user.getFirstName() + " " + user.getLastName() + "!");
            user.setFirstName("New name");
        };

        List<User> users = List.of(
            new User("Алиса",   "Иванова"),
            new User("Боб",     "Петров"),
            new User("Чарли",   "Сидоров"),
            new User("Диана",   "Козлова"),
            new User("Евгений", "Новиков")
        );


        System.out.println("=== Приветствия (Consumer<User>) ===");
        users.forEach(greet);

        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}

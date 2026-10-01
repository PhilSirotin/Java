package task3_random_gen;

import java.util.function.Supplier;
import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        String[] seriesList = {"AA", "BB", "CC", "DD", "EE"};

        Supplier<Ticket> ticketSupplier = () -> {
            int number      = random.nextInt(100) + 1;
            String series   = seriesList[random.nextInt(seriesList.length)];
            return new Ticket(number, series);
        };

        System.out.println("=== Генерация случайных билетов (Supplier<Ticket>) ===");
        for (int i = 1; i <= 7; i++) {
            System.out.printf("Билет %d: %s%n", i, ticketSupplier.get());
        }
    }
}

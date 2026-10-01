package task9_heavy_box;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BoxSeparator {
    public static void main(String[] args) {
        List<HeavyBox> allBoxes = new ArrayList<>(List.of(
            new HeavyBox("A1", 150.0, "Картон"),
            new HeavyBox("B2", 450.0, "Дерево"),
            new HeavyBox("C3", 299.9, "Пластик"),
            new HeavyBox("D4", 300.1, "Металл"),
            new HeavyBox("E5", 800.0, "Дерево"),
            new HeavyBox("F6", 100.0, "Картон"),
            new HeavyBox("G7", 350.0, "Пластик")
        ));

        List<HeavyBox> heavyBoxes = new ArrayList<>();

        System.out.println("=== Исходная коллекция ===");
        allBoxes.forEach(System.out::println);

        // Predicate<HeavyBox> — проверяет, является ли коробка тяжёлой (> 300г)
        Predicate<HeavyBox> isHeavy = box -> box.getWeightGrams() > 300;

        // Лямбда: перемещаем тяжёлые коробки в отдельную коллекцию
        allBoxes.removeIf(box -> {
            if (isHeavy.test(box)) {
                heavyBoxes.add(box);
                return true;
            }
            return false;
        });

        System.out.println("\n=== Лёгкие коробки (≤ 300г) ===");
        allBoxes.forEach(System.out::println);

        System.out.println("\n=== Тяжёлые коробки (> 300г) ===");
        heavyBoxes.forEach(System.out::println);
    }
}

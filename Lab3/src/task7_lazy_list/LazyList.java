package task7_lazy_list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LazyList<T> {

    private final List<Supplier<T>> suppliers;
    private final List<T> cache;

    public LazyList(List<Supplier<T>> suppliers) {
        this.suppliers = new ArrayList<>(suppliers);
        this.cache     = new ArrayList<>();
        for (int i = 0; i < suppliers.size(); i++) {
            cache.add(null);
        }
    }

    public T get(int index) {
        if (index < 0 || index >= suppliers.size()) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона: " + index);
        }
        if (cache.get(index) == null) {
            System.out.printf("  [lazy] вычисляю элемент [%d]...%n", index);
            cache.set(index, suppliers.get(index).get());
        }
        return cache.get(index);
    }

    public int size() { return suppliers.size(); }

    public LazyList<T> filter(Predicate<T> predicate) {
        List<Supplier<T>> result = new ArrayList<>();
        for (int i = 0; i < suppliers.size(); i++) {
            final int idx = i;
            T val = get(idx);
            if (predicate.test(val)) {
                result.add(() -> val);
            }
        }
        return new LazyList<>(result);
    }

    public static void main(String[] args) {
        // Список Supplier<Product> — каждый продукт создаётся лениво
        List<Supplier<Product>> suppliers = new ArrayList<>();
        String[] names  = {"Хлеб", "Молоко", "Масло", "Сыр", "Колбаса", "Яйца", "Сметана"};
        double[] prices = {55.0,    89.9,     120.0,   350.0, 410.0,     95.0,   75.5};

        for (int i = 0; i < names.length; i++) {
            final String n = names[i];
            final double p = prices[i];
            suppliers.add(() -> new Product(n, p));
        }

        LazyList<Product> lazyList = new LazyList<>(suppliers);

        System.out.println("=== Ленивый список продуктов (Supplier<Product>) ===");
        System.out.println("\nЗапрашиваем элементы 0, 3, 5:");
        System.out.println("get(0) = " + lazyList.get(0));
        System.out.println("get(3) = " + lazyList.get(3));
        System.out.println("get(5) = " + lazyList.get(5));

        System.out.println("\nПовторный get(0) — берётся из кэша:");
        System.out.println("get(0) = " + lazyList.get(0));

        System.out.println("\nФильтрация — только продукты дороже 100 руб:");
        LazyList<Product> expensive = lazyList.filter(p -> p.getPrice() > 100);
        System.out.println("Результат:");
        for (int i = 0; i < expensive.size(); i++) {
            System.out.println("  " + expensive.get(i));
        }
    }
}

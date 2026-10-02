import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
        System.out.println("Добавлено в корзину: " + product);
    }

    public void purchase() {
        if (products.isEmpty()) {
            System.out.println("Корзина пуста.");
            return;
        }

        double total = 0;
        System.out.println("Покупка оформлена:");
        for (Product product : products) {
            System.out.println(product);
            total += product.getPrice();
        }

        System.out.println("Итого: " + total + " сом");
        products.clear();
    }
}
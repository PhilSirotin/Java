import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private final List<Product> products = new ArrayList<>();
    private final Cart cart = new Cart();

    public Shop() {
        products.add(new Product(1, "Клавиатура", "Электроника", 2500));
        products.add(new Product(2, "Наушники", "Электроника", 1800));
        products.add(new Product(3, "Футболка", "Одежда", 1200));
        products.add(new Product(4, "Куртка", "Одежда", 6500));
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Логин: ");
        String login = scanner.nextLine();
        System.out.print("Пароль: ");
        String password = scanner.nextLine();

        User user = new User("user", "1234");
        if (!user.authenticate(login, password)) {
            System.out.println("Неверный логин или пароль.");
            return;
        }

        System.out.println("Вход выполнен.");

        boolean running = true;
        while (running) {
            System.out.println("\nВыберите операцию:");
            System.out.println("1 — Каталоги");
            System.out.println("2 — Товары каталога");
            System.out.println("3 — Добавить товар в корзину");
            System.out.println("4 — Купить товары из корзины");
            System.out.println("0 — Выход");
            System.out.print("> ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите номер операции.");
                continue;
            }

            Operation operation;
            switch (choice) {
                case 1:
                    operation = Operation.SHOW_CATALOGS;
                    break;
                case 2:
                    operation = Operation.SHOW_PRODUCTS;
                    break;
                case 3:
                    operation = Operation.ADD_TO_CART;
                    break;
                case 4:
                    operation = Operation.PURCHASE;
                    break;
                case 0:
                    operation = Operation.EXIT;
                    break;
                default:
                    System.out.println("Такой операции нет.");
                    continue;
            }

            switch (operation) {
                case SHOW_CATALOGS:
                    showCatalogs();
                    break;
                case SHOW_PRODUCTS:
                    System.out.print("Введите название каталога: ");
                    showProducts(scanner.nextLine());
                    break;
                case ADD_TO_CART:
                    showAllProducts();
                    System.out.print("Введите номер товара: ");
                    addToCart(scanner.nextLine());
                    break;
                case PURCHASE:
                    cart.purchase();
                    break;
                case EXIT:
                    running = false;
                    System.out.println("До свидания!");
                    break;
            }
        }
    }

    private void showCatalogs() {
        System.out.println("Каталоги:");
        products.stream()
                .map(Product::getCatalog)
                .distinct()
                .forEach(System.out::println);
    }

    private void showProducts(String catalog) {
        boolean found = false;
        for (Product product : products) {
            if (product.getCatalog().equalsIgnoreCase(catalog)) {
                System.out.println(product);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Каталог не найден или в нём нет товаров.");
        }
    }

    private void showAllProducts() {
        System.out.println("Товары:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private void addToCart(String input) {
        try {
            int id = Integer.parseInt(input);
            for (Product product : products) {
                if (product.getId() == id) {
                    cart.add(product);
                    return;
                }
            }
            System.out.println("Товар с таким номером не найден.");
        } catch (NumberFormatException e) {
            System.out.println("Введите номер товара числом.");
        }
    }
}
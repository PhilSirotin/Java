public class Product {
  private final int id;
  private final String name;
  private final String catalog;
  private final double price;

    public Product(int id, String name, String catalog, double price) {
        this.id = id;
        this.name = name;
        this.catalog = catalog;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getCatalog() {
        return catalog;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + ". " + name + " — " + price + " сом";
    }
}
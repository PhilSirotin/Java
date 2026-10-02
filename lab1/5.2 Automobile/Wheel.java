public class Wheel {
  private final int diameterInches;
  private final String brand;

  public Wheel(int diameterInches, String brand) {
    this.diameterInches = diameterInches;
    this.brand = brand;
  }

  public void move() {
    System.out.println("Колесо " + brand + " (" + diameterInches + " дюймов) вращается.");
  }
}

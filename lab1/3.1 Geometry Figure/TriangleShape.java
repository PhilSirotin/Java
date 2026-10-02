public class TriangleShape implements Shape {
  private final double base;
  private final double height;

  public TriangleShape(double base, double height) {
    this.base = base;
    this.height = height;
  }

  @Override 
  public double calculateArea() {
    return base * height / 2;
  }
}
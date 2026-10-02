public class Body { 
  private final String color;
  private final String type;

  public Body(String color, String type) {
    this.color = color;
    this.type = type;
  }

  @Override 
  public String toString() {
    return type + ", color" + color;
  }
}
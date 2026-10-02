public class Engine {
  private final String type;
  private final int powerHP;

  public Engine(String type, int powerHP) {
    this.type = type;
    this.powerHP = powerHP;
  }

  @Override 
  public String toString() {
    return type + ", " + powerHP + "л.с.";
  }
}

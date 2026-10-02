public class CPU {
  private final String model;
  private final double speedGHz;

  public CPU(String model, double speedGHz) {
    this.model = model;
    this.speedGHz = speedGHz;
  }

  @Override 
  public String toString() {
    return model + ", " + speedGHz + " ГГц";
  }
}

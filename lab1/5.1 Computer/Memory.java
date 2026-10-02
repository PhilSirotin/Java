public class Memory {
  private final int capacityGB;
  private final String type;

  public Memory(int capacityGB, String type) {
    this.capacityGB = capacityGB;
    this.type = type;
  }

  @Override 
  public String toString() {
    return capacityGB + " GB" + type;
  }
}

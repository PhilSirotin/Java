public class Storage {
  private final String type;
  private final int capacityGB;

  public Storage(String type, int capacityGB) {
    this.type = type;
    this.capacityGB = capacityGB;
  }

  @Override
  public String toString() {
    return type + ", " + capacityGB + " GB";
  }
}

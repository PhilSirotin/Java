public class Monitor {
  private final double screenSizeInches;
  private final String resolution;

  public Monitor(double screenSizeInches, String resolution) {
    this.screenSizeInches = screenSizeInches;
    this.resolution = resolution;
  }

  @Override
  public String toString() {
    return screenSizeInches + "inch." + resolution;
  }
}

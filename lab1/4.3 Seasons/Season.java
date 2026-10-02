public enum Season {
  WINTER(-10),
  SPRING(10),
  SUMMER(25) {
    @Override 
    public String getDescription() {
      return "Теплое время года";
    }
  },
  AUTUMN(8);

  private final double averageTemperature;

  Season(double averageTemperature) {
    this.averageTemperature = averageTemperature;
  }

  public double getAverageTemperature() {
    return averageTemperature;
  }

  public String getDescription() {
    return "Холодное время года";
  }
}
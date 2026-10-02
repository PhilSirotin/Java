public class Phone {
  private String number;
  private String model;
  private double weight;

  public Phone(){
    this.number = "N/A";
    this.model = "N/A";
    this.weight = 0;
  }

  public Phone(String number, String model) {
    this.number = number;
    this.model = model;
  }

  public Phone(String number, String model, double weight) {
    this(number, model);
    this.weight = weight;
  }

  public void receiveCall(String name) {
    System.out.println("Call" + name);
  }

  public void receiveCall(String name, String callerNumber) {
    System.out.println("Call " + name + ", number: " + callerNumber);
  }

  public String getNumber() {
    return number;
  }

  public String getModel() {
    return model;
  }

  public double getWeight() {
    return weight;
  }

  public void sendMessage(String... numbers) {
    System.out.println("Message send on the numbers: ");
    for (String n : numbers) {
      System.out.println(n);
    }
  }

  @Override
  public String toString() {
    return "Phone [number= " + number + ", model=" + model + ", weight=" + weight + "]";
  }
}
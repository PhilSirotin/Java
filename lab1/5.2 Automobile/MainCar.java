public class MainCar {
  public static void main(String[] args) {
    Engine engine = new Engine("Бензиновый", 150);

    Wheel[] wheels = {
      new Wheel(17, "Michelin"),
      new Wheel(17, "Michelin"),
      new Wheel(17, "Michelin"),
      new Wheel(17, "Michelin")
    };

    Body body = new Body("red", "sedan");
    Car car = new Car(engine, wheels, body);

    car.start();
  }
}

public class Car {
  private final Engine engine;
  private final Wheel[] wheels;
  private final Body body;

  public Car(Engine engine, Wheel[] wheels, Body body) {
    if(wheels.length != 4){
      throw new IllegalArgumentException("У автомобился должно быть четыре колеса");
    }

    this.engine = engine;
    this.wheels = wheels;
    this.body = body;
  }

  public void start() {
    System.out.println("Запуск двигателя: " + engine);
    System.out.println("Автомобиль начинает движение.");
    for (Wheel wheel : wheels) {
      wheel.move();
    }
  }
}

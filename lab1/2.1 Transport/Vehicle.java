public class Vehicle {
  private String make;
  private String model;
  private int year;

  public Vehicle(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }

  @Override
  public String toString() {
    return "Производитель: " + make
            + ", модель: " + model
            + ", год выпуска: " + year;
  }
}

class Car extends Vehicle {
  private int numberOfDoors;

  public Car(String make, String model, int year, int numberOfDoors) {
    super(make, model, year);
    this.numberOfDoors = numberOfDoors;
  }

  @Override 
public String toString() {
        return "Car [Производитель: " + getMake() + ", Модель: " + getModel() + ", Год выпуска: " + getYear() + ", Количество дверей: " + numberOfDoors + "]";
    }
}

class Truck extends Vehicle {
  private double loadCapacity;

  public Truck(String make, String model, int year, double loadCapacity) {
    super(make, model, year);
    this.loadCapacity = loadCapacity;
  }

  public double getLoadCapacity() {
    return loadCapacity;
  }

  @Override 
  public String toString() {
        return "Truck [Производитель: " + getMake() + ", Модель: " + getModel() + ", Год выпуска: " + getYear() + ", Грузоподъемность: " + loadCapacity + " т]";
    }
}


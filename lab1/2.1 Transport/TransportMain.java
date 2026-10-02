public class TransportMain {
  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle("Generic", "Standart", 2018);

    Car car1 = new Car("Toyota", "Camry", 2022, 4);
    Car car2 = new Car("Mercedes-Benz", "G223", 2024, 4);

    Truck truck1 = new Truck("Tesla", "Truck", 2025, 24.0);
    Truck truck2 = new Truck("Volvo", "FH16", 2021, 20.0);

    System.out.println("Information about Vehicle");
    System.out.println(vehicle);
    System.out.println(car1);
    System.out.println(car2);
    System.out.println(truck1);
    System.out.println(truck2);
  }
}

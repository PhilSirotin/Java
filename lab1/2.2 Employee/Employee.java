public class Employee {
  private String name;
  private int employeeID;
  private double salary;

  public Employee(String name, int employeeId, double salary)  {
    this.name = name;
    this.employeeID = employeeId;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public int getEmployeeId() {
    return employeeID;
  }

  public double getSalary() {
    return salary;
  }

  public double calculateBonus() {
    return 0.0;
  }

  @Override 
  public String toString() {
    return String.format(
            "Сотрудник: %s, ID: %d, зарплата: %.2f, бонус: %.2f",
            name, getEmployeeId(), salary, calculateBonus()
    );
    }
}

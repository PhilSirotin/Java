public class EmployeeMain {
  public static void main(String[] args) {
    Employee[] employees = {
      new Manager("Aijan", 101, 80000, 7),
      new Manager("Beka", 102, 70000, 4),
      new Developer("Nurbek", 103, 90000, "Java")
    };

    for(Employee employee : employees) {
      System.out.println(employee);
    }
  }
}

package task6_composition;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name   = name;
        this.salary = salary;
    }

    public String getName()    { return name; }
    public double getSalary()  { return salary; }

    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return String.format("Employee{name='%s', salary=%.2f}", name, salary);
    }
}

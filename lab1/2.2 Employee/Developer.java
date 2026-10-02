public class Developer extends Employee{
  private String programmingLanguage;
  
  public Developer(
    String name,
    int employeeId,
    double salary,
    String programmingLanguage
  ) {
    super(name, employeeId, salary);
    this.programmingLanguage = programmingLanguage;
  }
  
  public String getProgrammingLangugage() {
    return programmingLanguage;
  }

      @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }

    @Override
    public String toString() {
        return String.format(
                "Разработчик: %s, ID: %d, зарплата: %.2f, язык: %s, бонус: %.2f",
                getName(), getEmployeeId(), getSalary(),
                programmingLanguage, calculateBonus()
        );
    }
}

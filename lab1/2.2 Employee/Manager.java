public class Manager extends Employee{
  private int teamSize;

  public Manager(String name, int employeeId, double salary, int teamSize) {
    super(name, employeeId, salary);
    this.teamSize = teamSize;
  }

  public int getTeamSize() {
    return teamSize;
  }

  @Override 
      public double calculateBonus() {
        return getSalary() * (teamSize > 5 ? 0.10 : 0.05);
    }

    @Override
    public String toString() {
        return String.format(
                "Менеджер: %s, ID: %d, зарплата: %.2f, команда: %d, бонус: %.2f",
                getName(), getEmployeeId(), getSalary(), teamSize, calculateBonus()
        );
    }
}

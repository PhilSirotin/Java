package task6_composition;

import task6_composition.Employee;

import java.util.function.Function;
import java.util.List;

public class FunctionComposition {

    public static <A, B, C> Function<A, C> compose(Function<A, B> first, Function<B, C> second) {
        return first.andThen(second);
    }

    public static void main(String[] args) {
      Function<Employee, Employee> raiseSalary = emp -> {
            emp.setSalary(emp.getSalary() * 1.20);
            return emp;
        };

        // Function<Employee, Employee> — добавление бонуса 5000
        Function<Employee, Employee> addBonus = emp -> {
            emp.setSalary(emp.getSalary() + 5000);
            return emp;
        };

        // Function<Employee, String> — форматирование итогового сообщения
        Function<Employee, String> toReport = emp ->
            String.format("Сотрудник: %-15s | Итоговая зарплата: %.2f", emp.getName(), emp.getSalary());

        // Композиция: сначала +20%, потом +5000, потом в строку
        Function<Employee, String> fullPipeline = compose(compose(raiseSalary, addBonus), toReport);

        List<Employee> employees = List.of(
            new Employee("Иванов",   50000),
            new Employee("Петрова",  70000),
            new Employee("Сидоров", 100000)
        );

        System.out.println("=== Композиция функций (Function<Employee, ...>) ===");
        System.out.println("Шаги: зарплата × 1.20 → + 5000 → отчёт");
        System.out.println();
        employees.forEach(emp -> System.out.println(fullPipeline.apply(emp)));
    }
}

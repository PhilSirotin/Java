package task10_students;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades;

    public Student(String name, String group, int course, Map<String, Integer> grades) {
        this.name   = name;
        this.group  = group;
        this.course = course;
        this.grades = new HashMap<>(grades);
    }

    public String getName()              { return name; }
    public String getGroup()             { return group; }
    public int getCourse()               { return course; }
    public Map<String, Integer> getGrades() { return grades; }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0;
        return grades.values().stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }

    public void promoteToCourse(int next) { this.course = next; }

    @Override
    public String toString() {
        return String.format("Student{name='%s', group='%s', course=%d, avg=%.2f}",
            name, group, course, getAverageGrade());
    }
}

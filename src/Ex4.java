import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Classes.Ex4_Classes.Student;
import Classes.Ex4_Classes.Employee;

public class Ex4 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван", "Иванов", "Иванович", 20));
        students.add(new Student("Петр", "Петров", "Петрович", 25));
        students.add(new Student("Иван", "Петров", "Петрович", 23));
        students.add(new Student("Петр", "Иванов", "Петрович", 27));

        System.out.println("\nСписок студентов");
        students.forEach(b -> System.out.println(b));

        List<Employee> employees = students.stream()
                .map(student -> new Employee(student.getName(), student.getSurname(),
                        student.getPatronymic(), student.getAge()))
                .collect(Collectors.toList());

        System.out.println("\nСписок Работников");
        employees.forEach(employee -> System.out.println(employee));
    }
}
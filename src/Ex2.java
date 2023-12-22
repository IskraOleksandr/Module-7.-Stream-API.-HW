import Classes.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println();

        List<Student> students = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            students.add(new Student("Фамилия" + i + " Имя" + i + " Отчество" + i, i % 2 == 0 ? "Группа 1" : "Группа 2", (int) (Math.random() * 10) + 15));
        }

        students.forEach(b -> System.out.println(b));

        System.out.println("\nФамилии  всех студентов младших 16 лет.\n");//(только фамилии по заданию)

        List<String> surnames = students.stream()
                .filter(student -> student.getAge() < 16)
                .map(student -> student.getFullName().split(" ")[0]) // получаем фамилию
                .collect(Collectors.toList());

        surnames.forEach(System.out::println);
    }
}

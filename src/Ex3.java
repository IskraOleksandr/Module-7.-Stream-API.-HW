import Classes.StudentN;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println();
        List<StudentN> students = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            students.add(new StudentN("Фамилия" + i + " Имя" + i + " Отчество" + i, i % 2 == 0 ? "Группа 1" : "Группа 2", randomNumber(10, 15), randomNumber(6, 6)));
        }

        students.forEach(b -> System.out.println(b));

        OptionalDouble averagePoints = students.stream()
                .mapToDouble(StudentN::getPoints)
                .average();

        averagePoints.ifPresent(student -> System.out.println("\nСредний балл всех студентов: " + averagePoints.getAsDouble()));

    }

    public static int randomNumber(int number, int number1) {
        return (int) (Math.random() * number) + number1;
    }
}

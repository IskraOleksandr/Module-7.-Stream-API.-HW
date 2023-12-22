import java.util.*;
import Classes.Car;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println();
        List<Car> cars = new ArrayList<>();

        // добавляем 100 разных машин в список
        for (int i = 1; i < 101; i++) {
            cars.add(new Car("автомобиль " + i, i % 2 == 0 ? "красный" : "синий", (int)
                    (Math.random() * 237) + 101));
        }

        cars.forEach(b -> System.out.println(b));

        Optional<Car> fastestRedCar = cars.stream()
                .filter(car -> car.getColor().equals("красный")) // фильтруем только красные машины
                .max(Comparator.comparingInt(Car::getMaxSpeed)); // находим максимальную скорость

        fastestRedCar.ifPresent(car -> System.out.println("\nСамая быстрая красная машина:\n" + car));
    }
}
package Classes.Ex4_Classes;

public class Student {
    private String name;
    private String surname;
    private String patronymic;
    private int age;

    public Student(String name, String surname, String patronymic, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
    }

    public String toString() {
        return "Студент = Имя: " + name + ", Фамилия: " + surname +
                ", Отчество: " + patronymic + ", Возраст: " + age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getAge() {
        return age;
    }

}
package Classes;

public class StudentN {
    private String fullName;
    private int age;
    private String group;
    private int points;

    public StudentN(String fullName, String group, int age, int points) {
        this.fullName = fullName;
        this.group = group;
        this.age = age;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Фио: " + this.fullName + ", Возраст: " + this.age + ", Группа: " + this.group + ", Cуммарный бал: " + this.points;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGroup() {
        return group;
    }

    public int getAge() {
        return age;
    }

    public int getPoints() {
        return points;
    }
}

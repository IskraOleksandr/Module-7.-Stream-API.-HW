package Classes;

public class Student {
    private String fullName;
    private int age;
    private String group;

    public Student(String fullName, String group, int age) {
        this.fullName = fullName;
        this.age = age;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Фио: " + this.fullName + ", Возраст: " + this.age + ", Группа: " + this.group;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }
}

package day6.task3;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ольга", "физика");
        Student student = new Student("Алиса");
        teacher.evaluate(student);
    }
}

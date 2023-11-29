package day9.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentName = sc.nextLine();
        String groupName = sc.nextLine();

        Student student = new Student(studentName, groupName);
        student.printInfo();

        String teacherName = sc.nextLine();
        String subjectName = sc.nextLine();

        Teacher teacher = new Teacher(teacherName, subjectName);
        teacher.printInfo();
    }
}

package day14;

import javafx.scene.shape.Line;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());

    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static List<Person> parseFileToObjList() {
        File personFile = new File("people.txt");
        List<Person> people = new ArrayList<>();

        try {
            Scanner sc = new Scanner(personFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] eachPerson = line.split(" ");
                String name = eachPerson[0];
                int age = Integer.parseInt(eachPerson[1]);

                if (age < 0) {
                    throw new IllegalAccessException();
                }
                Person thisPerson = new Person(eachPerson[0], age);
                people.add(thisPerson);
            }


        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден");
        } catch (IllegalAccessException ex) {
            System.out.println("Некорректный входной файл");
        }
        return people;

    }
}

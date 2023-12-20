package day14;
//Реализовать статический метод
//        List<String> parseFileToStringList(File file), который считывает содержимое этого файла и возвращает список,
//        состоящий из значений имен и возрастов каждого человека. Получить данный список в методе main() и распечатать
//        его в консоль.
//        В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить
//        в консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно, необходимо
//        выбрасывать исключение, выводить в консоль сообщение “Некорректный входной файл” и возвращать null или
//        пустой список.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(parseFileToStringList());
    }

    public static List<String> parseFileToStringList() throws FileNotFoundException {
        File file = new File("people.txt");
        List<String> people = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0) {
                    throw new IllegalAccessException();
                }
                people.add(line);
            }
            return people;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalAccessException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;

    }
}

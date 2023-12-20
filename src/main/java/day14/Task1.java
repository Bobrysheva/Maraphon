package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws Exception {
        printSumDigits();

    }

    public static void printSumDigits() {
        File newFile = new File("New_file");

        try {
            Scanner scanner = new Scanner(newFile);
            String line = scanner.nextLine();
            String[] stringNumbers = line.split(" ");
            int sum = 0;

            for (String number : stringNumbers) {
                sum += Integer.parseInt(number);

            }

            if (stringNumbers.length != 10) {
                throw new IllegalAccessException();
            }
            System.out.println(Arrays.toString(stringNumbers));
            scanner.close();
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalAccessException e) {
            System.out.println("Некорректный входной файл");
        }

    }
}
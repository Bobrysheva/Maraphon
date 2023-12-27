package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File numbers = new File("New_file.txt");
        try {
            Scanner catchNumbers = new Scanner(numbers);
            String line = catchNumbers.nextLine();
            String[] stringNumbers = line.split(" ");
            int sum = 0;
            int counter = 0;
            for (String number : stringNumbers) {
                sum += Integer.parseInt(number);
                counter++;
            }
            double a = (double) sum / counter;
            String str = String.format(" -->  %.3f.", a);
            System.out.println(a + str);

        } catch (FileNotFoundException e) {
            System.out.println("Файл с числами не найден");;
        }
    }
}
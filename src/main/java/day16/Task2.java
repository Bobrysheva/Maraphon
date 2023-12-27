package day16;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file1 = new File("file1.txt");

            File file2 = new File("file2.txt");
            int[] numbers = new int[1000];
            int b = 20;
            int a = numbers.length / b;
            double[] numbers2 = new double[a];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = (int) (Math.random() * 100);
            }
            for (int d = 1; d <= a; d++) {
                int countTwenty = 0;
                for (int j = 1; j <= b; j++) {
                    countTwenty += (numbers[j * d - 1]);
                }
                numbers2[d - 1] = (double) countTwenty / b;
            }
            PrintWriter printWriter = new PrintWriter(file1);
            printWriter.println(Arrays.toString(numbers));

            PrintWriter printWriter2 = new PrintWriter(file2);
            for (int i = 0; i < numbers2.length; i++) {
                printWriter2.print(numbers2[i] + " ");

            }

            printWriter.close();
            printWriter2.close();
            printResult(file2);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner catchNumbers = new Scanner(file);
        String line = catchNumbers.nextLine();
        String[] stringNumbers = line.split(" ");

        double sum = 0;
        for (String number : stringNumbers) {
            sum += Double.parseDouble(number);
        }
        System.out.println((int) sum);
    }
}
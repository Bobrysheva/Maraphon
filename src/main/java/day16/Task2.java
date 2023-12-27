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
            int b = 4;
            int a = numbers.length/b;
            long [] numbers2 = new long[a];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = (int) (Math.random() * 1000);
            }
            for (int d=1; d<=a; d++){
                int countFour = 0;
                for (int j = 1; j <= b; j++) {
                countFour += (numbers[j*d - 1]);
                }
                numbers2[d-1] = countFour/b;
            }
            System.out.println(Arrays.toString(numbers));
            PrintWriter printWriter = new PrintWriter(file1);
            printWriter.println(Arrays.toString(numbers));

            System.out.println(Arrays.toString(numbers2));
            PrintWriter printWriter2 = new PrintWriter(file2);
            printWriter2.println(Arrays.toString(numbers2));


            printWriter.close();
            printWriter2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
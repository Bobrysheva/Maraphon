package day4;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] numbers = new int[a];
        Random rand = new Random();
        for (int i = 0; i < a; i++) {
            numbers[i] = rand.nextInt(10);
        }
        for (int b : numbers
        ) {
            System.out.println(b);
        }
        System.out.println();
        System.out.println(numbers.length);
        int more_8 = 0;
        int are_1 = 0;
        int even = 0;
        int odd = 0;
        int summ = 0;
        for (int i = 0; i < a; i++) {
            if (numbers[i] > 8) {
                more_8++;
            }
            if (numbers[i] == 1) {
                are_1++;
            }
            if (numbers[i] % 2 == 0) {
                even++;
            }
            if (numbers[i] % 2 != 0) {
                odd++;
            }
            if (true) {
                summ = summ + numbers[i];
            }
        }
        System.out.println("Чисел более восьми - " + more_8);
        System.out.println("Чисел, равных единице - " + are_1);
        System.out.println("Четных чисел - " + even);
        System.out.println("Нечетных чисел - " + odd);
        System.out.println("Сумма всех чисел массива = " + summ);
    }
}

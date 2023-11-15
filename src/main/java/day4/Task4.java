package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i < (arr.length - 2); i++) {
            int sum = arr[i] + arr[i + 1] + arr[i + 2];
            if (sum >= max) {
                max = sum;
                index = i;
            }
        }
        System.out.println("Максимальная сумма равна " + max);
        System.out.println("Индекс первого элемента тройки - " + index);
    }
}

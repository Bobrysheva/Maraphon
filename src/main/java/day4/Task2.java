package day4;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        int max = arr[0];
        int min = arr[0];
        int areNullEnd = 0;
        int sumNull = 0;
        for (int a : arr) {
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
            if (a % 10 == 0){
                areNullEnd++;
                sumNull=sumNull+a;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(areNullEnd);
        System.out.println(sumNull);
    }
}

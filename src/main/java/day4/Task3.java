package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 8;
        int m = 12;
        int[][] arr = new int[n][m];
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = random.nextInt(50);
            }
        }
        for (int i = 0; i < n; i++) {
            int summ = 0;
            for (int j = 0; j < m; j++) {
                summ = summ + arr[i][j];
            }
                        if (summ > max) {
                max = summ;
            }
        }
        System.out.println(max);
    }
}



package day7.task2;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(90 + (int) random.nextInt(10));
        Player player2 = new Player(90 + (int) random.nextInt(10));
        Player player3 = new Player(90 + (int) random.nextInt(10));
        Player player4 = new Player(90 + (int) random.nextInt(10));
        Player player5 = new Player(90 + (int) random.nextInt(10));
        Player player6 = new Player(90 + (int) random.nextInt(10));


        for (int i = 1; i == player1.stamina; i++)
            player1.run();

        System.out.println(player1.stamina);
        Player.info();

    }
}

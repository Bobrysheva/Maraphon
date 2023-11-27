package day8.task1;
public class Task1_2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String ai = "0 ";
        for (int i = 0; i <= 20000; i++) {
            ai = (ai + " " + i);
        }
        System.out.println(ai);
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
    }
}
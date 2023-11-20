package day6.task2;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 2020, 15, 10000);
        airplane.setYear(2015);
        airplane.setLength(21);
        airplane.fillUp(500);
        airplane.fillUp(470);
        airplane.info();
    }
}

package day7.task1;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Airbus", 2020, 23, 10000);
        Airplane airplane2 = new Airplane("Boeing", 2022, 15, 12000);
        Airplane.compareAirplanes(airplane1, airplane2);

    }
}
package day5.task1;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("BMV");
        car1.setColour("red");
        car1.setReleaseYear(2020);

        System.out.println(car1.getModel());
        System.out.println(car1.getColour());
        System.out.println(car1.getReleaseYear());
    }
}

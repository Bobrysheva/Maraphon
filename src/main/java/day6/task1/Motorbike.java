package day6.task1;

public class Motorbike {
    private String model;
    private String colour;
    private int releaseYear;

    Motorbike(String model, String colour, int releaseYear) {
        this.model = model;
        this.colour = colour;
        this.releaseYear = releaseYear;
    }

    protected String getModel() {
        return model;
    }

    protected String getColour() {
        return colour;
    }

    protected int getReleaseYear() {
        return releaseYear;
    }

    void info() {
        System.out.println("Это автомобиль");
    }

    int yearDifference(int inputYear) {
        int difference = Math.abs((inputYear - releaseYear));
        return difference;
    }
}

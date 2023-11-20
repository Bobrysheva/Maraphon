package day6.task1;

public class Car {
    private String model;
    private String colour;
    private int releaseYear;

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
    public void info() {
        System.out.println("Это автомобиль");
    }

    int yearDifference(int inputYear) {
        int difference = Math.abs((inputYear - releaseYear));
        return difference;
    }
}
